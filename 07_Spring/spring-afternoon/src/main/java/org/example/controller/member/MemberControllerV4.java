package org.example.controller.member;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.member.MemberDtoListV2;
import org.example.dto.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
@RequestMapping("/member/v4")
public class MemberControllerV4 {
    //private MemberDtoListV2 memberDtoListV2;
    private MemberRepository memberRepository;

    @Autowired
    public MemberControllerV4(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //   /member/v3/show
    @GetMapping("/show")
    public String memberList(Model model) {
        log.info("==========> 회원 목록 조회 페이지 호출, /member/v4/show");

        model.addAttribute("memberList", memberRepository.findAll());
        return "member-show4";
    }

}
