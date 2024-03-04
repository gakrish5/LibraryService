package com.cis.batch33.library.service;

import com.cis.batch33.library.entity.Member;
import com.cis.batch33.library.model.MemberDTO;
import com.cis.batch33.library.repository.BookRepository;
import com.cis.batch33.library.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private BookRepository bookRepository;

    public MemberDTO getMember(int memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(IllegalArgumentException::new);
        return modelMapper.map(member, MemberDTO.class);
    }

    public List<MemberDTO> getAllMembers() {
        List<Member> members = memberRepository.findAll();
        return members.stream().map( lm ->
        {
            return modelMapper.map(lm, MemberDTO.class);
        }).collect(Collectors.toList());
    }

    public MemberDTO createMember(MemberDTO memberDTO){
        Member m = modelMapper.map(memberDTO,Member.class);
        Member lm = memberRepository.save(m);
        memberDTO.setMemberId(lm.getMemberId());
        memberDTO.getAddress().setAddressId(lm.getAddress().getAddressId());
        return modelMapper.map(lm, MemberDTO.class);
    }

    public Member updateMember(int memberId, Member updatedMember) {
        Member m = modelMapper.map(updatedMember, Member.class);
        Member lm = memberRepository.save(m);
        return modelMapper.map(lm, Member.class);
    }

    public void deleteMember(int memberId) {
        Member member =  memberRepository.findById(memberId).orElseThrow(IllegalArgumentException::new);
        // Simulating database delete
        memberRepository.deleteById(memberId);
    }
}