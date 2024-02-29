package com.cis.batch33.library.service;

import com.cis.batch33.library.entity.Member;
import com.cis.batch33.library.model.AddressDTO;
import com.cis.batch33.library.model.CheckoutDTO;
import com.cis.batch33.library.model.MemberDTO;
import com.cis.batch33.library.repository.LibraryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MemberService {

    @Autowired
    private LibraryMemberRepository memberRepository;

    public Member createMember(Member member){
        return memberRepository.save(member);
    }

    public MemberDTO getMember(int memberId) {
        Optional<Member> memberOptional =
                memberRepository.findById(memberId);
        Member member =
                memberOptional.orElse(new Member());

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberId(member.getMemberId());
        memberDTO.setMemberShipLevel(member.getMemberShipLevel());
        memberDTO.setEmailAddress(member.getEmailAddress());
        memberDTO.setFirstName(member.getFirstName());
        memberDTO.setLastName(member.getLastName());
        memberDTO.setPhoneNumber(member.getPhoneNumber());

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setAddressId(member.getAddress().getAddressId());
        addressDTO.setLine1(member.getAddress().getLine1());
        addressDTO.setLine2(member.getAddress().getLine2());
        addressDTO.setCity(member.getAddress().getCity());
        addressDTO.setState(member.getAddress().getState());
        addressDTO.setZip(member.getAddress().getZip());

        List<CheckoutDTO> checkoutDTOS =
                member.getCheckouts().stream().map(c -> {
                    CheckoutDTO cdo = new CheckoutDTO();
                    cdo.setId(c.getId());
                    cdo.setIsbn(c.getIsbn());
                    cdo.setCheckoutDate(c.getCheckoutDate());
                    cdo.setDueDate(c.getDueDate());
                    cdo.setReturned(c.isReturned());
                    return  cdo;
                }).collect(Collectors.toList());

        memberDTO.setAddress(addressDTO);
        memberDTO.setCheckouts(checkoutDTOS);

        return memberDTO;
    }

    public Member updateMember(int memberId, Member updatedMember) {
        return memberRepository.save(updatedMember);
    }

    public void deleteMember(int memberId) {
        // Simulating database delete
        memberRepository.deleteById(memberId);
    }
}