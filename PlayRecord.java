package com.gupaoedu.vip.pattern.prototype;

import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;

public class PlayRecord {

	/** 主键ID */
	private Long recordId;
	/** 剧集编号 */
	private Long conAlbumId;
	/** cp剧集编号 */
	private String outConAlbumId;
	/** 子剧集编号 */
	private Long conContentId;
	/** 播放内容名称 */
	private String contentName;
	/** 模式 */
	private String mode;
	/** 播放地址 */
	private String playUrl;
	/** 海报url */
	private String poster = "";
	/** 修改时间 */
	private String updateTime;
	/** 修改时间2 */
	private Date updateTime2;
	/** 当前影视播放时间 */
	private Long currPlayTime;
	/** cp子剧集编号 */
	private String outConContentId;
	/** cpId */
	private String cpId;
	/** 剧集时间 */
	private String duration = "";
	/** 剧集时间 */
	private Long durationL = 0L;
	/** 剩余时间 */
	private String remainIngTime = "";
	/** 是否为剧集0：电影1：电视剧、综艺 */
	private String albumType;
	/** 下一集 子剧集编号 */
	private Long nextConContentId = 0L;
	/** 下一集 cp子剧集编号 */
	private String nextOutConContentId = "0";
	/** 播放内容名称 */
	private String nextContentName = "";
	/** 当前集数 */
	private String orderNumber;
	/** 下一集数 */
	private String nextOrderNumber;
	/** 是否是正片 */
	private String isMain;
	/** 一级分类 */
	private String category1Ids;
	/** 二级分类 */
	private String category2Ids;
	/** 是否是VIP视频 */
	private String payMark;
	/** 是否可播放 */
	private String isPlay;
	/** 上次播放平台 */
	private Long platform;

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public void setConAlbumId(Long conAlbumId) {
		this.conAlbumId = conAlbumId;
	}

	public void setOutConAlbumId(String outConAlbumId) {
		this.outConAlbumId = outConAlbumId;
	}

	public void setConContentId(Long conContentId) {
		this.conContentId = conContentId;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public void setUpdateTime2(Date updateTime2) {
		this.updateTime2 = updateTime2;
	}

	public void setCurrPlayTime(Long currPlayTime) {
		this.currPlayTime = currPlayTime;
	}

	public void setOutConContentId(String outConContentId) {
		this.outConContentId = outConContentId;
	}

	public void setCpId(String cpId) {
		this.cpId = cpId;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setDurationL(Long durationL) {
		this.durationL = durationL;
	}

	public void setRemainIngTime(String remainIngTime) {
		this.remainIngTime = remainIngTime;
	}

	public void setAlbumType(String albumType) {
		this.albumType = albumType;
	}

	public void setNextConContentId(Long nextConContentId) {
		this.nextConContentId = nextConContentId;
	}

	public void setNextOutConContentId(String nextOutConContentId) {
		this.nextOutConContentId = nextOutConContentId;
	}

	public void setNextContentName(String nextContentName) {
		this.nextContentName = nextContentName;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setNextOrderNumber(String nextOrderNumber) {
		this.nextOrderNumber = nextOrderNumber;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

	public void setCategory1Ids(String category1Ids) {
		this.category1Ids = category1Ids;
	}

	public void setCategory2Ids(String category2Ids) {
		this.category2Ids = category2Ids;
	}

	public void setPayMark(String payMark) {
		this.payMark = payMark;
	}

	public void setIsPlay(String isPlay) {
		this.isPlay = isPlay;
	}

	public void setPlatform(Long platform) {
		this.platform = platform;
	}

	// 未使用原型模式之前代码
	private PlayRecord getRecord(UsrPlayRecord record) {
		PlayRecord returnRecord = new PlayRecord();
		returnRecord.setRecordId(record.getId());
		returnRecord.setPlayUrl(record.getPlayUrl());
		returnRecord.setPlatform(record.getPlatform());
		returnRecord.setUpdateTime2(record.getUDate());
		returnRecord.setCpId(record.getCpId());
		returnRecord.setConAlbumId(record.getConAlbumId());
		returnRecord.setCurrPlayTime(record.getCurrPlayTime());
		returnRecord.setContentName(record.getContentName());
		returnRecord.setConContentId(record.getConContentId());
		returnRecord.setOutConAlbumId(record.getOutConAlbumId());
		returnRecord.setOutConContentId(record.getOutConContentId());
		return returnRecord;
	}
	
	//使用原型模式后
	private PlayRecord getRecord1(UsrPlayRecord record) {
		PlayRecord returnRecord = new PlayRecord();
		try{
			BeanUtils.copyProperties(record,returnRecord);
		}catch(Exception e){
			e.printStackTrace();
		}
		return returnRecord;
	}
	
}
