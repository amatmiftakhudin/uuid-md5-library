package com.miftakhudin.library.uuidmd5generator;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

class UUIDMD5GeneratorImpl implements UUIDMD5Generator {

    UUIDMD5GeneratorImpl() {
    }

    @Override
    public String generate() {
    	String out = "";
    	UUID uuid= UUID.randomUUID();
    	out = md5Hash(uuid.toString());
        return out;
    }
    
    private String md5Hash(String text) {
    	MessageDigest md;
    	String myHash = DigestUtils.md5Hex(text).toUpperCase();
		return myHash;
        
    }

}
