# Diffusion kernel

A well-known network propagation algorithm in graph theory.  It works by selecting the subgraph you intend to diffusion and run the algorithm with the specific loss for every node. Hence it will delimit the scale.

A [blog](http://www.haotian.life/2020/08/10/diffusion-kernel/) is written for the introduction and the math proof for this algorithm.

## How to run it

First you have to build by maven, and please make sure your workplace is currently located at the root of the whole project.

```, 
mvn compile
```

Next, you could navigate the [test method](https://github.com/164140757/MyAlgorithms/blob/master/src/test/java/Algorithms/Graph/Dynamic/DKTest.java) which I wrote for the demo in my blog.

![](README.assets/res.png)

And here is the scores they get, as I put it into a percentage value to denote the account of fluid it contains and visualize it manually.

![image-20200810184132359](README.assets/image-20200810184132359.png)

You could test it in a larger data set. And any bug  if there is, you could contact my by bht98@i.shu.edu.cn

