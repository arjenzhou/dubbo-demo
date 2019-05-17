## Notes
### ZooKeeper

There my be some questions about dubbo register to zk like https://stackoverflow.com/questions/56153450/why-dubbo-provider-always-register-to-a-wrong-address/56180362#56180362  
and   
https://github.com/apache/incubator-dubbo/issues/4055.

To fix this problem, you need to edit your nameserver in  `/etc/hosts` to your nameserver.

For example, I am running the code on my Ubuntu machine and zk run on it, too.  
Just edit it like 

```bash
127.0.0.1       localhost
127.0.1.1       arjenzhou-GE62
```

p.s. arjenzhou-GE62 is my `hostname`