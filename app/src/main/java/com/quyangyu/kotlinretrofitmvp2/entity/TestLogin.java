package com.quyangyu.kotlinretrofitmvp2.entity;

public class TestLogin {


    /**
     * status : 0
     * msg : 登录成功
     * data : {"id":24,"username":"yicooll","password":"","email":"459909255@qq.com","phone":null,"question":null,"answer":null,"role":0,"createTime":1549005674000,"updateTime":1549005674000}
     */

    private int status;
    private String msg;
    private DataBean data;

    public TestLogin(int status, String msg, DataBean data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 24
         * username : yicooll
         * password :
         * email : 459909255@qq.com
         * phone : null
         * question : null
         * answer : null
         * role : 0
         * createTime : 1549005674000
         * updateTime : 1549005674000
         */



        private int id;
        private String username;
        private String password;
        private String email;
        private Object phone;
        private Object question;
        private Object answer;
        private int role;
        private long createTime;
        private long updateTime;

        public DataBean(int id, String username, String password, String email, Object phone, Object question, Object answer, int role, long createTime, long updateTime) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.phone = phone;
            this.question = question;
            this.answer = answer;
            this.role = role;
            this.createTime = createTime;
            this.updateTime = updateTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public Object getQuestion() {
            return question;
        }

        public void setQuestion(Object question) {
            this.question = question;
        }

        public Object getAnswer() {
            return answer;
        }

        public void setAnswer(Object answer) {
            this.answer = answer;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }
    }
}
