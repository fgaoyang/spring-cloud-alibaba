resource：资源名称
limitApp：来源应用
grade：阈值类型，0表示线程数，1表示QPS
count：单机阈值
strategy：流控模式，0表示直接，1表示关联，2表示链路
controlBehavior：流控效果，0表示快速失败，1表示warm up，2表示排队等待
clusterMode：是否集群