
package org.com.castcodechallenge.comcastcodechallenge.api.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("live_date")
    @Expose
    private Object liveDate;
    @SerializedName("src_url")
    @Expose
    private Object srcUrl;
    @SerializedName("src_domain")
    @Expose
    private String srcDomain;
    @SerializedName("unsafe")
    @Expose
    private int unsafe;
    @SerializedName("maintainer")
    @Expose
    private Maintainer maintainer;
    @SerializedName("src_options")
    @Expose
    private SrcOptions srcOptions;
    @SerializedName("example_query")
    @Expose
    private String exampleQuery;
    @SerializedName("js_callback_name")
    @Expose
    private String jsCallbackName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("developer")
    @Expose
    private List<Developer> developer = null;
    @SerializedName("dev_date")
    @Expose
    private Object devDate;
    @SerializedName("tab")
    @Expose
    private String tab;
    @SerializedName("blockgroup")
    @Expose
    private Object blockgroup;
    @SerializedName("src_id")
    @Expose
    private int srcId;
    @SerializedName("producer")
    @Expose
    private Object producer;
    @SerializedName("is_stackexchange")
    @Expose
    private Object isStackexchange;
    @SerializedName("repo")
    @Expose
    private String repo;
    @SerializedName("created_date")
    @Expose
    private Object createdDate;
    @SerializedName("topic")
    @Expose
    private List<String> topic = null;
    @SerializedName("production_state")
    @Expose
    private String productionState;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("dev_milestone")
    @Expose
    private String devMilestone;
    @SerializedName("designer")
    @Expose
    private Object designer;
    @SerializedName("signal_from")
    @Expose
    private String signalFrom;
    @SerializedName("attribution")
    @Expose
    private Object attribution;
    @SerializedName("src_name")
    @Expose
    private String srcName;
    @SerializedName("perl_module")
    @Expose
    private String perlModule;

    public Object getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(Object liveDate) {
        this.liveDate = liveDate;
    }

    public Object getSrcUrl() {
        return srcUrl;
    }

    public void setSrcUrl(Object srcUrl) {
        this.srcUrl = srcUrl;
    }

    public String getSrcDomain() {
        return srcDomain;
    }

    public void setSrcDomain(String srcDomain) {
        this.srcDomain = srcDomain;
    }

    public int getUnsafe() {
        return unsafe;
    }

    public void setUnsafe(int unsafe) {
        this.unsafe = unsafe;
    }

    public Maintainer getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(Maintainer maintainer) {
        this.maintainer = maintainer;
    }

    public SrcOptions getSrcOptions() {
        return srcOptions;
    }

    public void setSrcOptions(SrcOptions srcOptions) {
        this.srcOptions = srcOptions;
    }

    public String getExampleQuery() {
        return exampleQuery;
    }

    public void setExampleQuery(String exampleQuery) {
        this.exampleQuery = exampleQuery;
    }

    public String getJsCallbackName() {
        return jsCallbackName;
    }

    public void setJsCallbackName(String jsCallbackName) {
        this.jsCallbackName = jsCallbackName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Developer> getDeveloper() {
        return developer;
    }

    public void setDeveloper(List<Developer> developer) {
        this.developer = developer;
    }

    public Object getDevDate() {
        return devDate;
    }

    public void setDevDate(Object devDate) {
        this.devDate = devDate;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public Object getBlockgroup() {
        return blockgroup;
    }

    public void setBlockgroup(Object blockgroup) {
        this.blockgroup = blockgroup;
    }

    public int getSrcId() {
        return srcId;
    }

    public void setSrcId(int srcId) {
        this.srcId = srcId;
    }

    public Object getProducer() {
        return producer;
    }

    public void setProducer(Object producer) {
        this.producer = producer;
    }

    public Object getIsStackexchange() {
        return isStackexchange;
    }

    public void setIsStackexchange(Object isStackexchange) {
        this.isStackexchange = isStackexchange;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public Object getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Object createdDate) {
        this.createdDate = createdDate;
    }

    public List<String> getTopic() {
        return topic;
    }

    public void setTopic(List<String> topic) {
        this.topic = topic;
    }

    public String getProductionState() {
        return productionState;
    }

    public void setProductionState(String productionState) {
        this.productionState = productionState;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDevMilestone() {
        return devMilestone;
    }

    public void setDevMilestone(String devMilestone) {
        this.devMilestone = devMilestone;
    }

    public Object getDesigner() {
        return designer;
    }

    public void setDesigner(Object designer) {
        this.designer = designer;
    }

    public String getSignalFrom() {
        return signalFrom;
    }

    public void setSignalFrom(String signalFrom) {
        this.signalFrom = signalFrom;
    }

    public Object getAttribution() {
        return attribution;
    }

    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public String getPerlModule() {
        return perlModule;
    }

    public void setPerlModule(String perlModule) {
        this.perlModule = perlModule;
    }

}
