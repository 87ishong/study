package com.ishong.webservice.domain.posts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * NoArgsConstructor : �⺻ ������ �ڵ� �߰�
 * - access = AccessLevel.PROTECTED : �⺻ �������� ���� ������ protected�� ����
 * - Entity Ŭ������ ������Ʈ �ڵ�󿡼� �⺻�����ڷ� �����ϴ� ���� ����, JPA���� Entity Ŭ������ �����ϴ°��� ����ϱ� ���� �߰�
 * Getter : Ŭ���� �� ��� �ʵ��� Getter �޼ҵ� �ڵ� ����
 * Entity : ���̺�� ��ũ�� Ŭ����
 * - ������ھ� ���̹�(_)���� �̸��� ��Ī(ex. PostsManager.java -> post_manager table)
 
 * 
 * @author Inseok
 *
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Posts {
	
	/**
	 * Id : �ش� ���̺��� PK �ʵ�
	 * GeneratedValue : PK�� ���� ��Ģ���� �⺻���� Auto increment
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Column : ���̺� �÷�, �������� ���� ��� ��� �ʵ�� �÷�
	 * �⺻�� �ܿ� �߰��� ������ �ʿ��� �ɼ��� �����ϱ� ���� ���(���ڿ��� ��� �⺻�� VARCHAR(255) -> length = 500)
	 */
	@Column(length = 500, nullable = false)
	private String title;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;
	
	private String author;

	/**
	 * Entity class
	 * ���� DB ���̺�� ��Ī�� Ŭ����
	 * Builder : �ش� Ŭ������ �������� Ŭ������ ����
	 * - ������ ��ܿ� ���� �� �����ڿ� ���Ե� �ʵ常 ������ ����
	 * @param title
	 * @param content
	 * @param author
	 */
	@Builder
	public Posts(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
	}
}
