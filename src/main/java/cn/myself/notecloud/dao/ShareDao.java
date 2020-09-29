package cn.myself.notecloud.dao;

import java.util.List;
import java.util.Map;

import cn.myself.notecloud.entity.Share;

public interface ShareDao {
	int save(Share share);
	@SuppressWarnings("rawtypes")
	List<Share> findNoteByTitle(Map params);
}
