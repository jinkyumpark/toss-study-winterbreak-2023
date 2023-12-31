# 토스 스터디 (2023년 겨울방학)
2023년 겨울방학에 진행하는 토스 Next 동기들과의 스터디

- 자바 웹 프로그래밍 Next Step
- Kotlin Cookbook
- 오브젝트

# 자바 웹 프로그래밍 Next Step
## 같이 하는 동기들 구경하기 👀
- [은우님](https://github.com/be-student/next-study)
- [좌훈님](https://github.com/JwahoonKim/nextstep-web)

## 참고링크
- https://github.com/slipp/web-application-server
- https://github.com/slipp/jwp-basic

## 실습
- [P1 - Calculator] 문자열 계산기
	- 2.3.1 - 기본 요구사항
		- 문자를 구분자로 분리한 후 각 숫자의 합을 구해 반환
		- ,와 :가 기본 구분자
		- 그 외에 //와 \n 사이에 원하는 문자열을 구분자로 지정 가능
		- 음수가 전달된 경우 RuntimeException으로 예외처리 해야 함
	- 2.3.3 - Refactoring
		- method가 1개의 책임만 가지도록
		- indent 깊이를 1로 유지
		- else를 사용하지 않기
- [P2 - QNA] 질문/답변 게시판
	- 처음 접근하면 질문 목록 화면
	    - 회원가입 / 로그인 / 로그아웃 / 개인정보 수정이 가능
	    - 질문하기 화면으로 이동 가능
	- 각 질문에는 상세화면이 있음
	    - 질문 CRUD
	    - 답변 CRUD
- [P3 - Web Server]
	- [P3.1] index.html 응답하기
	- [P3.2] GET 방식으로 회원가입하기
	- [P3.3] POST 방식으로 회원가입하기
	- [P3.4] 302 Status Code 적용
	- [P3.5] 로그인하기
	- [P3.6] 사용자 목록 출력
	- [P3.7] CSS 지원하기