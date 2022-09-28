package com.keduit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keduit.domain.BoardVO;
import com.keduit.domain.Criteria;
import com.keduit.domain.MemberVO;
import com.keduit.mapper.BoardMapper;
import com.keduit.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BoardServiceImpl implements BoardService {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper member;

	
	//==========게시글 새 글 작성==========	
	@Override
	public Long register(BoardVO vo) {
		mapper.insert(vo);
		return vo.getBno();
	}
	@Override
	public Long worryQnA_Register(BoardVO vo) {
		mapper.worryQnA_Insert(vo);
		return vo.getBno();
	}

	
	//==========1건 조회 get (글 상세보기)==========
	@Override
	public BoardVO companyVal_Get(Long bno) {
		return mapper.companyVal_Read(bno);
	}
	@Override
	public BoardVO interviewAns_Get(Long bno) {
		return mapper.interviewAns_Read(bno);
	}
	@Override
	public BoardVO passLatter_Get(Long bno) {	
		return mapper.passLatter_Read(bno);
	}
	@Override
	public BoardVO worryQnA_Get(Long bno) {
		return mapper.worryQnA_Read(bno);
	}
	@Override
	public BoardVO passSelfIntroduct_Get(Long bno) {
		return mapper.passSelfIntroduct_Read(bno);
	}

	
	//다음글 버튼 클릭 시 페이지 이동
	@Override
	public BoardVO companyVal_GetPluse(Long bno) {
		return mapper.companyVal_ReadPluse(bno);
	}
	@Override
	public BoardVO interviewAns_GetPluse(Long bno) {
		return mapper.interviewAns_ReadPluse(bno);
	}
	@Override
	public BoardVO passLatter_GetPluse(Long bno) {	
		return mapper.passLatter_ReadPluse(bno);
	}
	@Override
	public BoardVO worryQnA_GetPluse(Long bno) {
		return mapper.worryQnA_ReadPluse(bno);
	}
	@Override
	public BoardVO passSelfIntroduct_GetPluse(Long bno) {
		return mapper.passSelfIntroduct_ReadPluse(bno);
	}
	
	
	//==========게시판 1건 수정하기==========
	@Override
	public int companyVal_Modify(BoardVO vo) {
		return mapper.companyVal_Update(vo);
	}
	@Override
	public int interviewAns_Modify(BoardVO vo) {		
		return mapper.interviewAns_Update(vo);
	}
	@Override
	public int passLatter_Modify(BoardVO vo) {	
		return mapper.passLatter_Update(vo);
	}
	@Override
	public int worryQnA_Modify(BoardVO vo) {		
		return mapper.worryQnA_Update(vo);
	}
	@Override
	public int passSelfIntroduct_Modify(BoardVO vo) {		
		return mapper.passSelfIntroduct_Update(vo);
	}

	
	//==========게시판 1건 삭제하기==========	
	@Override
	public int companyVal_Remove(Long bno) {	
		return mapper.companyVal_Delete(bno);
	}
	@Override
	public int interviewAns_Remove(Long bno) {	
		return mapper.interviewAns_Delete(bno);
	}
	@Override
	public int passLatter_Remove(Long bno) {	
		return mapper.passLatter_Delete(bno);
	}
	@Override
	public int worryQnA_Remove(Long bno) {	
		return mapper.worryQnA_Delete(bno);
	}
	@Override
	public int passSelfIntroduct_Remove(Long bno) {	
		return mapper.passSelfIntroduct_Delete(bno);
	}
	
	
	//==========페이징 처리하기==========	
	@Override
	public int companyValTotal(Criteria cri) {		
		return mapper.companyValTotalCount(cri);
	}
	@Override
	public int interviewAnsTotal(Criteria cri) {		
		return mapper.interviewAnsTotalCount(cri);
	}
	@Override
	public int passLatterTotal(Criteria cri) {	
		return mapper.passLatterTotalCount(cri);
	}
	@Override
	public int worryQnATotal(Criteria cri) {	
		return mapper.worryQnATotalCount(cri);
	}
	@Override
	public int passSelfIntroductTotal(Criteria cri) {
		return mapper.passSelfIntroductTotalCount(cri);
	}
	
	
	// ==========각 게시판list 불러오는 부분==========
	@Override
	public List<BoardVO> companyValPaging(Criteria cri) {	
		return mapper.companyValPaging(cri);
	}
	@Override
	public List<BoardVO> interviewAnsPaging(Criteria cri) {
		return mapper.interviewAnsPaging(cri);
	}
	@Override
	public List<BoardVO> passLatterPaging(Criteria cri) {	
		return mapper.passLatterPaging(cri);
	}
	@Override
	public List<BoardVO> worryQnAPaging(Criteria cri) {	
		return mapper.worryQnAPaging(cri);
	}
	@Override
	public List<BoardVO> passSelfIntroductPaging(Criteria cri) {	
		return mapper.passSelfIntroductPaging(cri);
	}

	
	//좋아요수에 따른 list
	@Override
	public List<BoardVO> companyValViewsList(Criteria cri) {	
		return mapper.companyValViewsPaging(cri);
	}
	@Override
	public List<BoardVO> interviewAnsViewsList(Criteria cri) {	
		return mapper.interviewAnsViewsPaging(cri);
	}

	
	//게시물 들어가면 조회수 증가부분
	@Override
	public int companyValViewCount(Long bno) {
		return mapper.companyValViewCount(bno);
	}
	@Override
	public int interviewAnsViewCount(Long bno) {
		return mapper.interviewAnsViewCount(bno);
	}
	@Override
	public int passLatterViewCount(Long bno) {
		return mapper.passLatterViewCount(bno);
	}
	@Override
	public int worryQnAViewCount(Long bno) {
		return mapper.worryQnAViewCount(bno);
	}
	@Override
	public int passSelfIntroductViewCount(Long bno) {
		return mapper.passSelfIntroductViewCount(bno);
	}
	
	
	//게시물 좋아요 클릭시 좋아요 증가부분	
	@Override
	public int companyValLikeCount(Long bno) {
		return mapper.companyValLikeCount(bno);
	}
	@Override
	public int interviewAnsLikeCount(Long bno) {
		return mapper.interviewAnsLikeCount(bno);
	}
	@Override
	public int passLatterLikeCount(Long bno) {
		return mapper.passLatterLikeCount(bno);
	}
	@Override
	public int worryQnALikeCount(Long bno) {
		return mapper.worryQnALikeCount(bno);
	}
	@Override
	public int passSelfIntroductLikeCount(Long bno) {
		return mapper.passSelfIntroductLikeCount(bno);
	}
	
	
	//나의 최신글 list 뽑아내기
	@Override
	public List<BoardVO> readMyBoardList(String userid) {
		return mapper.getMyBoardList(userid);
	}
	
	
	//==========게시글에 보여지는 댓글 카운트==========
	@Override
	public void companyVal_TB_ReplyCnt(Long bno, int amount) {
		mapper.companyVal_TB_ReplyCnt(bno, amount);
	}
	@Override
	public void interviewAns_TB_ReplyCnt(Long bno, int amount) {
		mapper.interviewAns_TB_ReplyCnt(bno, amount);
	}
	@Override
	public void passLatter_TB_ReplyCnt(Long bno, int amount) {
		mapper.passLatter_TB_ReplyCnt(bno, amount);
	}
	@Override
	public void worryQnA_TB_ReplyCnt(Long bno, int amount) {
		mapper.worryQnA_TB_ReplyCnt(bno, amount);
	}
	@Override
	public void passSelfIntroduct_TB_ReplyCnt(Long bno, int amount) {
		mapper.passSelfIntroduct_TB_ReplyCnt(bno, amount);
	}
}
