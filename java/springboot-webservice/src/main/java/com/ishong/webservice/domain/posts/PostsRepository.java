package com.ishong.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ���� iBatis/MyBatis ��� DAO��� �Ҹ��� DB Layer ������ ���� 
 * JPA���� Repository��� �θ��� �������̽��� ����
 * �ܼ��� �������̽��� ���� �� JpaRepository<EntityŬ����, PKŸ��>�� ����ϸ� �⺻���� CRUD �޼ҵ尡 �ڵ� ����
 * @author Inseok
 *
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
