//게시물 등록, 호출
package com.WRITEME.dao;

import java.util.List;

import com.WRITEME.model.PostDTO;

public interface PostDAO {

	int newPost(PostDTO param) throws Exception;
    List<PostDTO> getPost(PostDTO param) throws Exception;

}
