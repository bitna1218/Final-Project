package com.keduit.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.keduit.domain.BoardVO;
import com.keduit.domain.Criteria;
import com.keduit.domain.MemberVO;

public interface BoardService {
	//새 글 작성
	public Long register(BoardVO vo);
	public Long worryQnA_Register(BoardVO vo);
	
	//1건 조회 (상세보기)
	public BoardVO companyVal_Get(Long bno);
	public BoardVO interviewAns_Get(Long bno);
	public BoardVO passLatter_Get(Long bno);
	public BoardVO worryQnA_Get(Long bno);
	public BoardVO passSelfIntroduct_Get(Long bno);
	
	//다음글 버튼 클릭 시 페이지 이동
	public BoardVO companyVal_GetPluse(Long bno);
	public BoardVO interviewAns_GetPluse(Long bno);
	public BoardVO passLatter_GetPluse(Long bno);
	public BoardVO worryQnA_GetPluse(Long bno);
	public BoardVO passSelfIntroduct_GetPluse(Long bno);
	
	//페이지 관련
	public List<BoardVO> companyValPaging(Criteria cri);
	public List<BoardVO> interviewAnsPaging(Criteria cri);
	public List<BoardVO> passLatterPaging(Criteria cri);
	public List<BoardVO> worryQnAPaging(Criteria cri);
	public List<BoardVO> passSelfIntroductPaging(Criteria cri);
	
	//1건 수정하기
	public int companyVal_Modify(BoardVO vo);
	public int interviewAns_Modify(BoardVO vo);
	public int passLatter_Modify(BoardVO vo);
	public int worryQnA_Modify(BoardVO vo);
	public int passSelfIntroduct_Modify(BoardVO vo);
	
	//1건 삭제하기
	public int companyVal_Remove(Long bno);
	public int interviewAns_Remove(Long bno);
	public int passLatter_Remove(Long bno);
	public int worryQnA_Remove(Long bno);
	public int passSelfIntroduct_Remove(Long bno);
	
	//검색한 데이터 불러오기
	public int companyValTotal(Criteria cri);
	public int interviewAnsTotal(Criteria cri);
	public int passLatterTotal(Criteria cri);
	public int worryQnATotal(Criteria cri);
	public int passSelfIntroductTotal(Criteria cri);

	//조회수에 따른 list
	public List<BoardVO> companyValViewsList(Criteria cri);
	public List<BoardVO> interviewAnsViewsList(Criteria cri);
	
	//게시물 좋아요 클릭시 좋아요 증가 메서드
	public int companyValViewCount(Long bno);
	public int interviewAnsViewCount(Long bno);
	public int passLatterViewCount(Long bno);
	public int worryQnAViewCount(Long bno);
	public int passSelfIntroductViewCount(Long bno);
	
	public int companyValLikeCount(Long bno);
	public int interviewAnsLikeCount(Long bno);
	public int passLatterLikeCount(Long bno);
	public int worryQnALikeCount(Long bno);
	public int passSelfIntroductLikeCount(Long bno);
	
	//나의 최신글 list 뽑아내기
	public List<BoardVO> readMyBoardList(String userid);
	
	//게시글에 보여지는 댓글 카운트
	public void companyVal_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void interviewAns_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void passLatter_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void worryQnA_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void passSelfIntroduct_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
}
