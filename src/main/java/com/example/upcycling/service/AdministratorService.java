package com.example.upcycling.service;

import com.example.upcycling.domain.dto.*;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.UserOrderVo;
import com.example.upcycling.mapper.AdministratorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdministratorService {
    private final AdministratorMapper administratorMapper;

//    가입자만 다음페이지 접근 가능
    public Long findAdminLogin(AdministratorDto administratorDto){
        Long number = administratorMapper.selectAdminNumber(administratorDto)
                .orElseThrow(() -> new IllegalStateException("유효하지 않은 회원정보"));
        return number;
    }

//    상품 조회
    public List<ProductDto> findProductInfo(Criteria criteria){
        return administratorMapper.selectProductInfo(criteria);
    }

//    상품 카운트 조회
    public int findTotal(){
        return administratorMapper.selectTotal();
    }
//    ----------------------------
//    상품 구매평 조회
    public List<ShopReviewDto> findProductReview(Criteria criteria){
        return administratorMapper.selectProductReview(criteria);
    }

//    상품 구매명 카운트 조회
    public int findReviewTotal(){
        return administratorMapper.selectReviewTotal();
    }
//    ------------------------------

    //  회원 정보 조회
    public List<UserDto> findUserInfo(Criteria criteria){
        return administratorMapper.selectUserInfo(criteria);
    }
//  회원 정보 카운트 조회
    public int findUserTotal(){return administratorMapper.selectUserTotal();}
//   ----------------------------

    // 회원 주문 조회
    public List<UserOrderVo> findUserOrder(Criteria criteria){return administratorMapper.selectUserOrder(criteria);}
//  회원 주문 정보 카운트 조회
    public int findUserOrderTotal(){return administratorMapper.selectUserOrderTotal();}
//--------------------

    //    faq 정보 조회
    public List<FaqDto> findFaqInfo(Criteria criteria){return  administratorMapper.selectFaqInfo(criteria);}
//     faq 정보 카운트 조회
    public int findFaqTotal(){return administratorMapper.selectFaqTotal();}

//    faq 삽입
    public void registerFaq(FaqDto faqDto){
        administratorMapper.insertFaq(faqDto);
    }
//    ------------------------

    //    point 정보 조회
    public List<UserDto> findPointInfo(Criteria criteria){return  administratorMapper.selectPointInfo(criteria);}
//    point 정보 카운트 조회
    public int findPointTotal(){return administratorMapper.selectPointTotal();}

//     -------삭제
//        product-info
    public void removeProductInfo(Long productNumber){
        administratorMapper.deleteProductInfo(productNumber);
    }

    //    product-review
    public void removeProductReview(Long reviewNumber){
        administratorMapper.deleteProductReview(reviewNumber);
    }

//    user-info
    public void removeUserInfo(Long userNumber){administratorMapper.deleteUserInfo(userNumber);}














}
