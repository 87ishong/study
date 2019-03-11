package com.ishong.webservice.domain.posts;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Posts Ŭ������ PostsRepository �������̽� ���� ��
 * �����ϱ� ���� �׽�Ʈ �ڵ� �ۼ�
 * @author Inseok
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTests {

	@Autowired
	PostsRepository postsRepository;
	
	@After
	public void cleanUp() {
		/**
		 * ���� �׽�Ʈ �ڵ忡 ������ ��ġ�� �ʱ� ����
		 * �׽�Ʈ ���� �� Repository�� ��� ���
		 */
		postsRepository.deleteAll();
	}
	
	@Test
	public void savePostAndloadPost() {
		// given
		// �׽�Ʈ ��� ȯ�� ����
		/**
		 * Builder�� ����ϱ� ���� �ڵ� �ۼ� �� ���� �߻� ��
		 * lombok ��ġ ���� Ȯ�ΰ� ������Ʈ�� lombok.jar ���� ���� Ȯ��
		 * �������� lombok �߰� �ܿ� lombok.jar ��ġ ������ ���ľ� ��
		 */
		postsRepository.save(Posts.builder()
				.title("Ÿ��Ʋ")
				.content("������")
				.author("ȫ�浿")
				.build());
		
		// when
		// �׽�Ʈ�ϰ��� �ϴ� ���� ����
		List<Posts> postsList = postsRepository.findAll();
		
		// then
		// �׽�Ʈ ��� ����
		Posts posts = postsList.get(0);
		assertThat(posts.getTitle(), is("Ÿ��Ʋ"));
		assertThat(posts.getContent(), is("������"));
		assertThat(posts.getAuthor(), is("ȫ�浿"));
	}
}
