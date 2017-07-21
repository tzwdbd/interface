package com.oversea.task.obj;


import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import com.oversea.task.util.Version;

/**
 * @author fengjian
 * @version V1.0
 * @title: sea-online
 * @Package com.oversea.entity
 * @date 15/10/12 23:36
 */
public class Machine implements Comparable<Machine>, Serializable {

    private static final long serialVersionUID = -1028716843697115966L;

    // 机器的ID
    private String id;

    //机器名
    private String machineName;

    // 主机名
    private String hostName;

    // 机器IP
    private String ip;

    //客户端同时接受最大任务数量
    private int maxQueueSize = 1;

    // 最近一次请求服务器的时间
    private long lastRequestTime;

    //上次活跃时间
    private long lastActiveTime;

    //属于的机器组
    private Set<String> belongGroups;

    //通道组
    private String channelGroup;

    //客户端jar包版本
    private String clientjarVersion;

    //cpu利用率
    private String cpuRatio;

    //剩余内存
    private String freeMemory;

    //OS
    private String osName;

    //已经使用内存
    private String usedMemory;

    //介绍信息
    private String currentTaskDesc;


    //传来的参数
    private transient Map<String, Object> parma = null;

    //创建机器时间
    private transient long createTime;

    //任务数量
    private transient AtomicInteger taskCnt = new AtomicInteger(0);

    //总任务数量
    private transient AtomicInteger totalTaskCnt = new AtomicInteger(0);

    public Machine() {
    }

    public Machine(String machineName, String ip, String hostName) {
        this.clientjarVersion = Version.getMd5JarVersion(getClass());
        this.machineName = machineName;
        this.ip = ip;
        this.hostName = hostName;
        this.lastActiveTime = System.currentTimeMillis();
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public long getLastRequestTime() {
        return lastRequestTime;
    }

    public void setLastRequestTime(long lastRequestTime) {
        this.lastRequestTime = lastRequestTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<String> getBelongGroups() {
        return belongGroups;
    }

    public void setBelongGroups(Set<String> belongGroups) {
        this.belongGroups = belongGroups;
    }

    /**
     * @return the hostName
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * @param hostName the hostName to set
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    public void addGroups(String[] groups) {
        if (this.belongGroups == null) {
            belongGroups = new HashSet<String>();
        }

        if (groups != null) {
            Collections.addAll(belongGroups, groups);
        }

    }

    public String getGroupsStr() {
        StringBuilder builder = new StringBuilder();
        if (this.belongGroups != null) {
            boolean isFirst = true;
            for (String group : this.belongGroups) {
                if (!isFirst) {
                    builder.append(";");
                }
                builder.append(group);
                isFirst = false;
            }
        }
        return builder.toString();
    }

    /**
     * @return the lastActiveTime
     */
    public long getLastActiveTime() {
        return lastActiveTime;
    }

    public void updateActive() {
        this.lastActiveTime = System.currentTimeMillis();
    }

    /**
     * @param groups
     */
    public void updateGroups(String[] groups) {
        this.belongGroups = new HashSet<String>();
        this.addGroups(groups);

    }

    /**
     * @param targetGroup
     * @return
     */
    public boolean isGroup(String targetGroup) {
        if (targetGroup == null || this.belongGroups == null) {
            return false;
        }
        return belongGroups.contains(targetGroup);
    }

    public int getTaskCnt() {
        return taskCnt.get();
    }

    /**
     * 增加任务数量
     */
    public void incrementTaskCnt() {
        taskCnt.incrementAndGet();
    }

    /**
     * 减少任务数量
     */
    public void decrementTaskCnt() {
        taskCnt.decrementAndGet();
    }

    public int getMaxQueueSize() {
        return maxQueueSize;
    }

    public void setMaxQueueSize(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public String getChannelGroup() {
        return channelGroup;
    }

    public void setChannelGroup(String channelGroup) {
        this.channelGroup = channelGroup;
    }

    public String getCpuRatio() {
        return cpuRatio;
    }

    public void setCpuRatio(String cpuRatio) {
        this.cpuRatio = cpuRatio;
    }

    public String getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(String freeMemory) {
        this.freeMemory = freeMemory;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(String usedMemory) {
        this.usedMemory = usedMemory;
    }

    public String getCurrentTaskDesc() {
        return currentTaskDesc;
    }

    public void setCurrentTaskDesc(String currentTaskDesc) {
        this.currentTaskDesc = currentTaskDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Machine)) return false;
        Machine machine = (Machine) o;
        if (id != null ? !id.equals(machine.id) : machine.id != null) return false;
        return !(machineName != null ? !machineName.equals(machine.machineName) : machine.machineName != null);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (machineName != null ? machineName.hashCode() : 0);
        return result;
    }

    public String getClientjarVersion() {
        return clientjarVersion;
    }

    public void setClientjarVersion(String clientjarVersion) {
        this.clientjarVersion = clientjarVersion;
    }

    public Map<String, Object> getParma() {
        return parma;
    }

    public void setParma(Map<String, Object> parma) {
        this.parma = parma;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    /**
     * 增加任务总数
     */
    public void incTotalTaskCnt() {
        totalTaskCnt.incrementAndGet();
    }

    public int getTotalTaskCnt() {
        return totalTaskCnt.get();
    }

    public Machine copyMachine(Machine machine) {
        this.setClientjarVersion(machine.getClientjarVersion());
        this.setChannelGroup(machine.getChannelGroup());
        this.setParma(machine.getParma());
        this.setMaxQueueSize(machine.getMaxQueueSize());
        this.setBelongGroups(machine.getBelongGroups());
        this.setHostName(machine.getHostName());
        this.setIp(machine.getIp());
        this.setCpuRatio(machine.getCpuRatio());
        this.setFreeMemory(machine.getFreeMemory());
        this.setOsName(machine.getOsName());
        this.setUsedMemory(machine.getUsedMemory());
        this.setCurrentTaskDesc(machine.getCurrentTaskDesc());
        return this;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id='" + id + '\'' +
                ", machineName='" + machineName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", ip='" + ip + '\'' +
                ", lastRequestTime=" + lastRequestTime +
                ", lastActiveTime=" + lastActiveTime +
                ", belongGroups=" + belongGroups +
                ", channelGroup='" + channelGroup + '\'' +
                ", cpuRatio='" + cpuRatio + '\'' +
                ", freeMemory='" + freeMemory + '\'' +
                ", osName='" + osName + '\'' +
                ", usedMemory='" + usedMemory + '\'' +
                ", taskCnt=" + taskCnt +
                '}';
    }

    @Override
    public int compareTo(Machine o) {
        int m1 = this.taskCnt.get();
        int m2 = o.taskCnt.get();
        return m1 - m2;
    }
}
