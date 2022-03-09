# 로그추적기
* 요구사항
  * 모든 PUBLIC 메서드의 호출과 응답 정보를 로그로 출력 
  * 애플리케이션의 흐름을 변경하면 안됨
    * 로그를 남긴다고 해서 비즈니스 로직의 동작에 영향을 주면 안됨 
  * 메서드 호출에 걸린 시간
  * 정상 흐름과 예외 흐름 구분
    * 예외 발생시 예외 정보가 남아야 함
  * 메서드 호출의 깊이 표현 
  * HTTP 요청을 구분
    * HTTP 요청 단위로 특정 ID를 남겨서 어떤 HTTP 요청에서 시작된 것인지 명확하게 구분이 가능해야 함
    * 트랜잭션 ID (DB 트랜잭션X), 여기서는 하나의 HTTP 요청이 시작해서 끝날 때 까지를 하나의 트랜잭션이라 함

***

> ### [V1](https://github.com/merry-santa/spring_advanced/tree/master/src/main/java/hello/advanced/app/v1)
> TODO
> 1. 메서드 호출의 깊이 표현 
> 2. HTTP 요청을 구분
>     1. HTTP 요청 단위로 특정 ID를 남겨서 어떤 HTTP 요청에서 시작된 것인지 명확하게 구분이 가능해야 함
>     2. 트랜잭션 ID (DB 트랜잭션X)  
>     
> 아직 구현하지 못한 요구사항은 메서드 호출의 깊이를 표현하고, 같은 HTTP 요청이면 같은 트랜잭션 ID를 남기는 것이다.  
> 이 기능은 직전 로그의 깊이와 트랜잭션 ID가 무엇인지 알아야 할 수 있는 일이다.  
> 예를 들어서 OrderController.request() 에서 로그를 남길 때 어떤 깊이와 어떤 트랜잭션 ID를 사용했는지를 그 다음에 로그를 남기는 OrderService.orderItem() 에서 로그를 남길 때 알아야한다.  
> 결국 현재 로그의 상태 정보인 트랜잭션ID 와 level 이 다음으로 전달되어야 한다. 정리하면 로그에 대한 문맥( Context ) 정보가 필요하다.

***


> ### [V2](https://github.com/merry-santa/spring_advanced/tree/master/src/main/java/hello/advanced/app/v2)
> TODO
> * HTTP 요청을 구분하고 깊이를 표현하기 위해 `TraceId`를 파라미터로 넘기는 것 말고 다른 방법 찾아보기

***

> ### [V3](https://github.com/merry-santa/spring_advanced/tree/master/src/main/java/hello/advanced/app/v3)
> * 매번 traceId를 넘겨주던 문제를 해결함





