package com.itao.common.utils;

import com.csource.fastdfs.*;
import org.csource.common.NameValuePair;

public class FastDFSClient {

    private TrackerClient trackerClient = null;
    private TrackerServer trackerServer = null;
    private StorageServer storageServer = null;
    private StorageClient1 storageClient1 = null;

    public FastDFSClient(String conf) throws Exception{
        if (conf.contains("classpath:")) {
            System.out.println(this.getClass().getResource("/").getPath());
            conf = conf.replace("classpath:", this.getClass().getResource("/").getPath());
        }
        ClientGlobal.init(conf);
        trackerClient = new TrackerClient();
        trackerServer = trackerClient.getConnection();
        storageServer = null;
        storageClient1 = new StorageClient1(trackerServer, storageServer);
    }

    public String uploadFile(String fileName, String extName, NameValuePair[] nameValuePairs) throws Exception {
        String result = storageClient1.upload_file1(fileName, extName, nameValuePairs);
        return result;
    }

    public String uploadFile(String fileName) throws Exception {
        String result = uploadFile(fileName, null, null);
        return result;
    }

    public String uploadFile(String fileName, String extName) throws Exception {
        String result = uploadFile(fileName, extName, null);
        return result;
    }



    public String uploadFile(byte[] fileContents, String extName, NameValuePair[] nameValuePairs) throws Exception {
        String result = storageClient1.upload_file1(fileContents, extName, nameValuePairs);
        return result;
    }

    public String uploadFile(byte[] fileContents) throws Exception {
        String result = uploadFile(fileContents, null, null);
        return result;
    }

    public String uploadFile(byte[] fileContents, String extName) throws Exception {
        String result = uploadFile(fileContents, extName, null);
        return result;
    }
}
