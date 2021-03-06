package board.service;

import java.util.List;

import board.dto.StoryBoardDTO;

public interface StoryBoardService {
	
	public List<StoryBoardDTO> getStoryBoardList();

	public String insertStoryBoard(StoryBoardDTO storyDTO);
	
	public StoryBoardDTO getDetailStoryBoard(int idx);

}
