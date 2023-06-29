<h4 align="center">
  <p>K8S in AWS</p>
  <p>Project created in Quarkus to deploy a rest server in aws cloud provider</p>
  <p>The main objective of this project is understand some features of k8s and aws.</p>
</h4>

<p align="center">
  <a href="#rocket-technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#information_source-how-to-use">How To Use</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#thumbsup-how-to-contribute">How To Contribute</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>


<p align="center">
<img alt="Collage" src="https://ik.imagekit.io/27ewoxssse/quarkus-in-aws_ZTCK_pZXP.png?updatedAt=1688065617547"> 
</p>

## :rocket: Technologies

This project was developed with the following technologies:

- API:

  - [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
  - [Quarkus](https://quarkus.io/)
  - [RESTEasy](https://resteasy.dev/)
  
- Utils:

  - [Docker](https://www.docker.com/)
  - [K8S](https://kubernetes.io/pt-br/docs/concepts/overview/what-is-kubernetes/)
  
## :information_source: How to use
To clone and run these configurations, you'll need [Git](https://git-scm.com), [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html), [Docker](https://www.docker.com/), [Kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/) and any tools that enables a development of a k8s locally, like [minikube](https://minikube.sigs.k8s.io/docs/) or [kind](https://kind.sigs.k8s.io/). 

From your command line:

```bash
# Clone this repository
$ git clone https://github.com/Duduxs/quarkus-k8s-aws

# Create a cluster 4 you
$ kind create cluster --name quarkus-k8s-aws

# Use your cluster
$ kubectl cluster-info --context quarkus-k8s-aws

# Create namespace and go to it
$ kubectl create namespace quarkus-k8s
$ kubectl config set-context --current --namespace=quarkus-k8s

# Deploy the loadbalancer, pods, replica set and containers in your cluster
$ kubectl apply -f devops/quarkus-k8s-aws-prd.yaml

# Do a port forward to access the load balancer and therefore be able to access the pods
$ kubectl port-forward svc/quarkus-k8s-aws 8080:8080

# Access your app
$ curl http://localhost:8080/api/test

```

## :thumbsup: How To Contribute

-  Make a fork;
-  Create a branch with your feature: `git checkout -b my-feature`;
-  Commit changes: `git commit -m 'feat: My new feature'`;
-  Make a push to your branch: `git push origin my-feature`.
    
---

<h4 align="center">
    Made by Eduardo José 😆 <a href="https://www.linkedin.com/in/eduarddojose/" target="_blank">Contact me!</a>
</h4>
