package com.keduit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.keduit.domain.BoardVO;
import com.keduit.domain.Criteria;

public interface BoardMapper {
	
	//페이징처리
	public List<BoardVO> companyValPaging(Criteria cri);
	public List<BoardVO> interviewAnsPaging(Criteria cri);
	public List<BoardVO> passLatterPaging(Criteria cri);
	public List<BoardVO> worryQnAPaging(Criteria cri);
	public List<BoardVO> passSelfIntroductPaging(Criteria cri);
	
	//게시글 insert
	public void insert(BoardVO vo);
	public void worryQnA_Insert(BoardVO vo);
	
	//게시글 조회 (키 값(bno)를 이용하여 read)
	public BoardVO companyVal_Read(Long bno);  
	public BoardVO interviewAns_Read(Long bno); 
	public BoardVO passLatter_Read(Long bno); 
	public BoardVO worryQnA_Read(Long bno); 
	public BoardVO passSelfIntroduct_Read(Long bno); 
	
	//다음글 버튼 클릭 시 페이지 이동
	public BoardVO companyVal_ReadPluse(Long bno);
	public BoardVO interviewAns_ReadPluse(Long bno);
	public BoardVO passLatter_ReadPluse(Long bno);
	public BoardVO worryQnA_ReadPluse(Long bno);
	public BoardVO passSelfIntroduct_ReadPluse(Long bno);
	
	//게시글 삭제
	public int companyVal_Delete(Long bno);
	public int interviewAns_Delete(Long bno);
	public int passLatter_Delete(Long bno);
	public int worryQnA_Delete(Long bno);
	public int passSelfIntroduct_Delete(Long bno);
	
	//게시글 수정
	public int companyVal_Update(BoardVO vo);
	public int interviewAns_Update(BoardVO vo);
	public int passLatter_Update(BoardVO vo);
	public int worryQnA_Update(BoardVO vo);
	public int passSelfIntroduct_Update(BoardVO vo);
	
	//파라미터를 받아서 페이징처리 sql 처리 메소드
	//public List<BoardVO> getListWithPaging(Criteria cri);
		
	//Criteria 내부의 검색 조건을 이용하여 데이터를 뿌려주기 위해 파라미터로 받는다.
	public int companyValTotalCount(Criteria cri);
	public int interviewAnsTotalCount(Criteria cri);
	public int passLatterTotalCount(Criteria cri);
	public int worryQnATotalCount(Criteria cri);
	public int passSelfIntroductTotalCount(Criteria cri);

	//조회수에 따른 list
	public List<BoardVO> companyValViewsList(Criteria cri);
	public List<BoardVO> companyValViewsPaging(Criteria cri);
	public List<BoardVO> interviewAnsViewsList(Criteria cri);
	public List<BoardVO> interviewAnsViewsPaging(Criteria cri);

	//조회수 증가 처리 메서드
	public int companyValViewCount(Long bno);
	public int interviewAnsViewCount(Long bno);
	public int passLatterViewCount(Long bno);
	public int worryQnAViewCount(Long bno);
	public int passSelfIntroductViewCount(Long bno);
	
	//좋아요 증가 처리 메서드
	public int companyValLikeCount(Long bno);
	public int interviewAnsLikeCount(Long bno);
	public int passLatterLikeCount(Long bno);
	public int worryQnALikeCount(Long bno);
	public int passSelfIntroductLikeCount(Long bno);
	
	//나의 최신글 list 뽑아내기
	public List<BoardVO> getMyBoardList(String userid);
	
	//게시글에 보여지는 댓글 카운트
	public void companyVal_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void interviewAns_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void passLatter_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void worryQnA_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
	public void passSelfIntroduct_TB_ReplyCnt(@Param ("bno") Long bno, @Param("amount") int amount);
}
