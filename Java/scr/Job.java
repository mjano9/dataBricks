/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ms255053
 */
public class Job {
    String inputPath;
    String fileName;
    String userName;
    String password;
    String ip;
    String dataBaseStaging;
    String workTable;
    String logTable;
    String err1Table;
    String err2Table;
    String jobName;
    String delimiter;

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    
    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDataBaseStaging() {
        return dataBaseStaging;
    }

    public void setDataBaseStaging(String dataBaseStaging) {
        this.dataBaseStaging = dataBaseStaging;
    }

    public String getWorkTable() {
        return workTable;
    }

    public void setWorkTable(String workTable) {
        this.workTable = workTable;
    }

    public String getLogTable() {
        return logTable;
    }

    public void setLogTable(String logTable) {
        this.logTable = logTable;
    }

    public String getErr1Table() {
        return err1Table;
    }

    public void setErr1Table(String err1Table) {
        this.err1Table = err1Table;
    }

    public String getErr2Table() {
        return err2Table;
    }

    public void setErr2Table(String err2Table) {
        this.err2Table = err2Table;
    }
    
}
