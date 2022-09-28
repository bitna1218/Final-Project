package com.keduit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.keduit.domain.BoardVO;
import com.keduit.domain.Criteria;
import com.keduit.domain.PageDTO;
import com.keduit.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@Log4j
@RequestMapping("/board/user/*")
public class BoardController {
	
	private final BoardService service;
	
	@GetMapping("/index")
	public void index(Criteria cri, Model model) {
		cri.setAmount(10);
		model.addAttribute("CompanyVal",service.companyValViewsList(cri));
		model.addAttribute("InterviewAns",service.interviewAnsViewsList(cri));
	}
	
	
	//--------------------리스트 불러오기-------------------------------
	@GetMapping("/CompanyVal/community")
	public void companyVal(Criteria cri, Model model) {
		model.addAttribute("CompanyVal",service.companyValPaging(cri));
		int total = service.companyValTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@GetMapping("/InterviewAns/community")
	public void interviewAns(Criteria cri, Model model) {
		model.addAttribute("InterviewAns",service.interviewAnsPaging(cri));
		int total = service.interviewAnsTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@GetMapping("/Passlatter/community")
	public void passLatter(Criteria cri, Model model) {
		model.addAttribute("Passlatter",service.passLatterPaging(cri));
		int total = service.passLatterTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@GetMapping("/WorryQnA/community")
	public void worryQnA(Criteria cri, Model model) {
		model.addAttribute("WorryQnA",service.worryQnAPaging(cri));
		int total = service.worryQnATotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@GetMapping("/PassSelfIntroduct/community")
	public void passSelfIntroduct(Criteria cri, Model model) {
		model.addAttribute("PassSelfIntroduct",service.passSelfIntroductPaging(cri));
		int total = service.passSelfIntroductTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	
	
	//--------------------조회수 버튼을 눌렀을 경우-------------------------------
	@PostMapping("/CompanyVal/community")
	public void companyValViews(Criteria cri, Model model) {
		cri.setTable("Views");
		model.addAttribute("CompanyVal",service.companyValPaging(cri));
		int total = service.companyValTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/InterviewAns/community")
	public void interviewAnsViews(Criteria cri, Model model) {
		cri.setTable("Views");
		model.addAttribute("InterviewAns",service.interviewAnsPaging(cri));
		int total = service.interviewAnsTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/Passlatter/community")
	public void passLatterViews(Criteria cri, Model model) {
		cri.setTable("Views");
		model.addAttribute("Passlatter",service.passLatterPaging(cri));
		int total = service.passLatterTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/WorryQnA/community")
	public void worryQnAViews(Criteria cri, Model model) {
		cri.setTable("Views");
		model.addAttribute("WorryQnA",service.worryQnAPaging(cri));
		int total = service.worryQnATotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/PassSelfIntroduct/community")
	public void passSelfIntroductViews(Criteria cri, Model model) {
		cri.setTable("Views");
		model.addAttribute("PassSelfIntroduct",service.passSelfIntroductPaging(cri));
		int total = service.passSelfIntroductTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	
	
	//--------------------좋아요 버튼을 눌렀을 경우-------------------------------	
	@PostMapping("/CompanyVal/community2")
	public void companyValLikes(Criteria cri, Model model) {
		cri.setTable("Likes");
		model.addAttribute("CompanyVal",service.companyValPaging(cri));
		int total = service.companyValTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/InterviewAns/community2")
	public void interviewAnsLikes(Criteria cri,Model model) {
		cri.setTable("Likes");
		log.info(cri.getTable() + "2");
		model.addAttribute("InterviewAns",service.interviewAnsPaging(cri));
		int total = service.interviewAnsTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/Passlatter/community2")
	public void passLatterLikes(Criteria cri, Model model) {
		cri.setTable("Likes");
		log.info(cri.getTable() + "2");
		model.addAttribute("Passlatter",service.passLatterPaging(cri));
		int total = service.passLatterTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/WorryQnA/community2")
	public void worryQnALikes(Criteria cri, Model model) {
		cri.setTable("Likes");
		log.info(cri.getTable() + "2");
		model.addAttribute("WorryQnA",service.worryQnAPaging(cri));
		int total = service.worryQnATotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}	
	@PostMapping("/PassSelfIntroduct/community2")
	public void passSelfIntroductLikes(Criteria cri, Model model) {
		cri.setTable("Likes");
		log.info(cri.getTable() + "2");
		model.addAttribute("PassSelfIntroduct",service.passSelfIntroductPaging(cri));
		int total = service.passSelfIntroductTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	
	
	//--------------------게시글 상세화면 1건 조회하기-------------------------------	
	@GetMapping({"/CompanyVal/reg-detail", "/CompanyVal/modify"})
	public void companyValRegdetail(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail..."+bno);
		service.companyValViewCount(bno);
		model.addAttribute("board", service.companyVal_Get(bno));
	}	
	@GetMapping({"/InterviewAns/reg-detail", "/InterviewAns/modify"})
	public void interviewAnsRegdetail(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail2..."+bno);
		service.interviewAnsViewCount(bno);
		model.addAttribute("board", service.interviewAns_Get(bno));
	}	
	@GetMapping({"/Passlatter/reg-detail", "/Passlatter/modify"})
	public void passLatterRegdetail(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail3..."+bno);
		service.passLatterViewCount(bno);
		model.addAttribute("board", service.passLatter_Get(bno));
	}	
	@GetMapping({"/WorryQnA/reg-detail", "/WorryQnA/modify"})
	public void worryQnARegdetail(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail14..."+bno);
		service.worryQnAViewCount(bno);
		model.addAttribute("board", service.worryQnA_Get(bno));
	}	
	@GetMapping({"/PassSelfIntroduct/reg-detail", "/PassSelfIntroduct/modify"})
	public void passSelfIntroductRegdetail(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail15..."+bno);
		service.passSelfIntroductViewCount(bno);
		model.addAttribute("board", service.passSelfIntroduct_Get(bno));
	}

	
	//--------------------게시물 좋아요 클릭시 좋아요 증가부분-------------------------------	
	@PostMapping("/CompanyVal/reg-detail2")
	public void companyValRegdetailLikes(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail2..."+bno);
		service.companyValLikeCount(bno);
		model.addAttribute("board", service.companyVal_Get(bno));
	}
	@PostMapping("/InterviewAns/reg-detail2")
	public void interviewAnsRegdetailLikes(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail2..."+bno);
		service.interviewAnsLikeCount(bno);
		model.addAttribute("board", service.interviewAns_Get(bno));
	}
	@PostMapping("/Passlatter/reg-detail2")
	public void passLatterRegdetailLikes(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail2..."+bno);
		service.passLatterLikeCount(bno);
		model.addAttribute("board", service.passLatter_Get(bno));
	}
	@PostMapping("/WorryQnA/reg-detail2")
	public void worryQnARegdetailLikes(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail2..."+bno);
		service.worryQnALikeCount(bno);
		model.addAttribute("board", service.worryQnA_Get(bno));
	}
	@PostMapping("/PassSelfIntroduct/reg-detail2")
	public void passSelfIntroductRegdetailLikes(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("reg-detail2..."+bno);
		service.passSelfIntroductLikeCount(bno);
		model.addAttribute("board", service.passSelfIntroduct_Get(bno));
	}

	
	//--------------------다음글 버튼 클릭 시 페이지 이동-------------------------------
	@PostMapping("/CompanyVal/reg-detail")
	public void companyValRegdetailPlus(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("CompanyVal reg-detail..."+bno);
		service.companyValViewCount(bno);
		model.addAttribute("board", service.companyVal_GetPluse(bno));
	}	
	@PostMapping("/InterviewAns/reg-detail")
	public void interviewAnsRegdetailPlus(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("InterviewAns reg-detail..."+bno);
		service.interviewAnsViewCount(bno);
		model.addAttribute("board", service.interviewAns_GetPluse(bno));
	}
	@PostMapping("/Passlatter/reg-detail")
	public void passLatterRegdetailPlus(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("Passlatter reg-detail..."+bno);
		service.passLatterViewCount(bno);
		model.addAttribute("board", service.passLatter_GetPluse(bno));
	}
	@PostMapping("/WorryQnA/reg-detail")
	public void worryQnARegdetailPlus(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("WorryQnA reg-detail..."+bno);
		service.worryQnAViewCount(bno);
		model.addAttribute("board", service.worryQnA_GetPluse(bno));
	}
	@PostMapping("/PassSelfIntroduct/reg-detail")
	public void passSelfIntroductRegdetailPlus(@RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri, Model model) {
		log.info("PassSelfIntroduct reg-detail..."+bno);
		service.passSelfIntroductViewCount(bno);
		model.addAttribute("board", service.passSelfIntroduct_GetPluse(bno));
	}
	
	
	//--------------------게시글 등록화면-------------------------------	
	@GetMapping("/CompanyVal/reg")
	public void companyValReg(Model model) {
	}
	@GetMapping("/InterviewAns/reg")
	public void interviewAnsReg(Model model) {
	}
	@GetMapping("/Passlatter/reg")
	public void passLatterReg(Model model) {
	}
	@GetMapping("/WorryQnA/reg")
	public void worryQnAReg(Model model) {
	}
	@GetMapping("/PassSelfIntroduct/reg")
	public void passSelfIntroductReg(Model model) {
	}

	
	//--------------------게시글 1건 등록하기-------------------------------	
	@PostMapping("/{select}/reg")
	public String register(BoardVO vo, RedirectAttributes rttr) {
		log.info("이거 select 값 --> " + vo.getSelect());
		Long bno = service.register(vo);		
		rttr.addFlashAttribute("result",vo.getBno());		
		return "redirect:/board/user/{select}/community";
	}	
	@PostMapping("/WorryQnA/regQnA")
	public String worryQnARegister(BoardVO vo, RedirectAttributes rttr, HttpServletRequest request) {
		log.info("WorryQnAregister...............");		
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		vo.setUserid(request.getParameter("userid"));
		vo.setCategory(request.getParameter("select2"));
		Long bno = service.worryQnA_Register(vo);		
		rttr.addFlashAttribute("result",vo.getBno());		
		return "redirect:/board/user/WorryQnA/community";
	}
	
	
	//--------------------게시글 1건 수정하기-------------------------------	
	 @PostMapping("/CompanyVal/modify") 
	 public String companyValModify(BoardVO vo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) { 
		 
		 //log.info("modify의 bno는:" + bno);
		 log.info("modify의 vo는:" + vo);
		 
		 int count = service.companyVal_Modify(vo);
		 
		 log.info("modify수정건수:" + count);
		 
		 //1건 수정이 정상적으로 작동 되었을 경우
		 if(count == 1) {
		 rttr.addFlashAttribute("result","success");
		 }	 
		 return "redirect:/board/user/CompanyVal/reg-detail?bno=" + vo.getBno();
	 }	 
	 @PostMapping("/InterviewAns/modify") 
	 public String interviewAnsModify(@RequestParam("bno") Long bno, BoardVO vo, RedirectAttributes rttr) { 
		 int count = service.interviewAns_Modify(vo);
		 log.info("modify" + bno);
		 
		 //1건 수정이 정상적으로 작동 되었을 경우
		 if(count == 1) {
			 rttr.addFlashAttribute("result","success");
		 }		 
		 return "redirect:/board/user/InterviewAns/reg-detail?bno=" + bno;
	 }	 
	 @PostMapping("/Passlatter/modify") 
	 public String passLatterModify(@RequestParam("bno") Long bno, BoardVO vo, RedirectAttributes rttr) { 
		 int count = service.passLatter_Modify(vo);
		 log.info("modify" + bno);
		 
		 //1건 수정이 정상적으로 작동 되었을 경우
		 if(count == 1) {
			 rttr.addFlashAttribute("result","success");
		 }		 
		 return "redirect:/board/user/Passlatter/reg-detail?bno=" + bno;
	 }	 
	 @PostMapping("/WorryQnA/modify") 
	 public String worryQnAModify(@RequestParam("bno") Long bno, BoardVO vo, RedirectAttributes rttr) { 
		 int count = service.worryQnA_Modify(vo);
		 log.info("modify" + bno);
		 
		 //1건 수정이 정상적으로 작동 되었을 경우
		 if(count == 1) {
			 rttr.addFlashAttribute("result","success");
		 }		 
		 return "redirect:/board/user/WorryQnA/reg-detail?bno=" + bno;
	 }	 
	 @PostMapping("/PassSelfIntroduct/modify") 
	 public String passSelfIntroductModify(@RequestParam("bno") Long bno, BoardVO vo, RedirectAttributes rttr) { 
		 int count = service.passSelfIntroduct_Modify(vo);
		 log.info("modify" + bno);
		 
		 //1건 수정이 정상적으로 작동 되었을 경우
		 if(count == 1) {
			 rttr.addFlashAttribute("result","success");
		 }		 
		 return "redirect:/board/user/PassSelfIntroduct/reg-detail?bno=" + bno;
	 }

	 
		//--------------------게시글 1건 삭제하기-------------------------------	
	 @PostMapping("/CompanyVal/remove") 
	 public String companyValRemove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		 log.info("remove" + bno);
		 int count = service.companyVal_Remove(bno);
		 
		 //1건 삭제가 정상적으로 작동 되었을 경우 
		 if(count == 1) {
	     rttr.addFlashAttribute("result","success");
		 }
		 return "redirect:/board/user/CompanyVal/community";
	 }
	 @PostMapping("/InterviewAns/remove") 
	 public String interviewAnsRemove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		 log.info("remove" + bno);
		 int count = service.interviewAns_Remove(bno);
		 //1건 삭제가 정상적으로 작동 되었을 경우 
		 
		 if(count == 1) {
		 rttr.addFlashAttribute("result","success");
		 }
		 return "redirect:/board/user/InterviewAns/community";
	 }
	 @PostMapping("/Passlatter/remove") 
	 public String passLatterRemove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		 log.info("remove" + bno);
		 int count = service.passLatter_Remove(bno);
		 
		 //1건 삭제가 정상적으로 작동 되었을 경우 
		 if(count == 1) {
		 rttr.addFlashAttribute("result","success");
		 }
		 return "redirect:/board/user/Passlatter/community";
	 }
	 @PostMapping("/WorryQnA/remove") 
	 public String worryQnARemove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		 log.info("remove" + bno);
		 int count = service.worryQnA_Remove(bno);	
		 
		 //1건 삭제가 정상적으로 작동 되었을 경우 
		 if(count == 1) {
		 rttr.addFlashAttribute("result","success");
		 }
		 return "redirect:/board/user/WorryQnA/community";
	 }	 
	 @PostMapping("/PassSelfIntroduct/remove") 
	 public String passSelfIntroductRemove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		 log.info("remove" + bno);
		 int count = service.passSelfIntroduct_Remove(bno);	
		 
		 //1건 삭제가 정상적으로 작동 되었을 경우 
		 if(count == 1) {
		 rttr.addFlashAttribute("result","success");
		 }
		 return "redirect:/board/user/PassSelfIntroduct/community";
	 }
}