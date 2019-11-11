package com.zq.bean;

public class LoginResponse {
    private int status;
    private String msg;
    private Data data;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data{
            private String member_id;//": 35,
            private String uname;//": "123",
            private String password;//": "ICy5YqxZB1uWSwcVLSNLcA==",
            private String email;//": "123",
            private int sex;//": 0,
            private String mobile;//": "",
            private long regtime;//": 1573450700000,
            private long lastlogin;//": null,
            private String image;//": "",
            private String memberAddresses;//": null

        public String getMember_id() {
            return member_id;
        }

        public void setMember_id(String member_id) {
            this.member_id = member_id;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
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

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public long getRegtime() {
            return regtime;
        }

        public void setRegtime(long regtime) {
            this.regtime = regtime;
        }

        public long getLastlogin() {
            return lastlogin;
        }

        public void setLastlogin(long lastlogin) {
            this.lastlogin = lastlogin;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getMemberAddresses() {
            return memberAddresses;
        }

        public void setMemberAddresses(String memberAddresses) {
            this.memberAddresses = memberAddresses;
        }
    }
    }


