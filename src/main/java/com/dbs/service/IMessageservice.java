package com.dbs.service;

import com.dbs.beans.message;

public interface IMessageservice {

	message findByMsgcode(String message_code);

}