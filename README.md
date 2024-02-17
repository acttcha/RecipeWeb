# 재료 기반 레시피 추천 웹 서비스
![image](https://github.com/acttcha/RecipeWeb/assets/128893836/78b9bdcd-ba13-40c1-b1e1-7b0dc19955d8)

## 1. 개요
스프링 프레임워크를 사용하여 사용자가 보유한 식재료를 기반으로 적합한 레시피를 추천하는 웹 시스템을 설계하고 구현하였다. 또한 MVC 패턴을 적용하여 비즈니스 로직과 사용자 인터페이스를 분리하여 개발하였고 MySQL과 Spring Data JPA를 사용하여 로그인 및 회원가입, 레시피와 댓글을 생성, 수정, 삭제, 조회할 수 있는 기능을 구현한다. Bootstrap을 사용하여 반응형 웹으로 만들어 모바일 환경에서도 최적화된 UI를 구축하였다.

## 2. 구현결과
![image](https://github.com/acttcha/RecipeWeb/assets/128893836/7f0f7819-4acd-4eb8-874a-e3cd3b50df08)
![image](https://github.com/acttcha/RecipeWeb/assets/128893836/a78edf5a-ca45-4427-ae69-57ff393cac44)
![image](https://github.com/acttcha/RecipeWeb/assets/128893836/2bf780e0-bd6a-46ea-893e-f22d5e679653)

## 3. 시스템 구성도
![image](https://github.com/acttcha/RecipeWeb/assets/128893836/5551a155-6aff-4fa0-a4c9-2a554c6ef473)

## 4. 개발 환경

<table><tr><th><b>구분</b></th><th><b>이름</b></th><th><b>버전</b></th></tr>
<tr><td>개발 언어</td><td>Java</td><td>- 11</td></tr>
<tr><td rowspan="2">프레임워크</td><td>SpringBoot</td><td>- 3.2.2</td></tr>
<tr><td>Bootstrap</td><td>- 5.3.1</td></tr>
<tr><td>데이터베이스</td><td>MySQL</td><td>- 8.0.32</td></tr>
<tr><td>템플릿엔진</td><td>Thymeleaf</td><td>- 3.1.2</td></tr>
<tr><td>IDE</td><td>IntelliJ</td><td>- 2022.3.3</td></tr>
<tr><td>서버 환경</td><td>Tomcat Apache</td><td>- 10.1.1</td></tr>
<tr><td>운영체제</td><td>Windows</td><td>- 10</td></tr>
</table>

## 5. ERD 및 샘플 데이터
![image](https://github.com/acttcha/RecipeWeb/assets/128893836/aa48c6f1-7279-4309-a164-144ec89c4e0d)

## 6. 흐름도
![image](https://github.com/acttcha/RecipeWeb/assets/128893836/2e2d170d-745d-4abd-99ef-c414ffacec25)


## References
[1] KOSTAT, https://kostat.go.kr/board.es?mid=a10301010000&bid=10820&tag=&act=view&list_no=422143&ref_bid=.
<br>
[2] Park YeonWoo, "Why College Students Living Alone Choose Not to Order Delivery Food", OhmyNews, November 29, 2022, https://www.ohmynews.com/NWS_Web/View/at_pg.aspx?CNTN_CD=A0002884420
<br>
[3] Min SeHee, Yeom HongSeon, "Recipe Recommendation System based on Ingredient by using Hybrid Filtering." Proceedings of the Winter Conference on Academic Presentation, p2, 2014
<br>
[4] Kim JongMin, “Principles and Understanding of Java Object-Oriented Programming for Spring Beginners”. WikiBooks(2015).
<br>
[5] “10000 Recipe”, http://www.10000recipe.com/.
<br>
