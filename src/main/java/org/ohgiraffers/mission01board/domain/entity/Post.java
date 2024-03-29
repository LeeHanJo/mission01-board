package org.ohgiraffers.mission01board.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

/* Entity
* 실제 세계의 객체나 개념을 소프트웨어 내에서 모델링 한 것으로, 데이터베이스의 테이블에 해당하는 클래스*/

/* @Data -> getter, setter, toString, equalsandhascode...
*  setter 를 사용한다면, 어디에서든 Entity 를 수정해버릴 수 있기 때문에 일관성을 유지하기 어렵다.
*  엔티티에서는 setter 를 쓰지않음(데이터의 일관성을 위해)*/

// @Entity : JPA Entity 라는 것을 의미한다. ID 와 @GeneratedValue 를 이용해 고유 식별자를 정의한다.

@Entity
// @Builder : 빌더 디자인 패턴을 자동으로 생성해준다.
@Builder
// @Getter : 클래스의 모든 필드에 대한 getter 메서드를 자동으로 생성해준다.
@Getter
// @AllArgsConstructor : 클래스의 모든 필드를 매개변수로 받는 전체 생성자를 자동 생성한다.
@AllArgsConstructor
// @No ArgConstructor : 매개변수가 없는 기본 생성자를 생성한다.
// accessLevel 을 통해 접근 수준을 설정 할 수 있다.
@NoArgsConstructor( access = AccessLevel.PROTECTED)
public class Post {

    @Id
    @GeneratedValue
    private Long postId;
    private String title;
    private String content;


}
