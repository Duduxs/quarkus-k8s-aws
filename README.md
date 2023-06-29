<h4 align="center">
  <p>K8S in AWS</p>
  <p>Project created in Quarkus to deploy a rest server in aws cloud provider</p>
  <p>The main objective of this project is understand some features of k8s and aws.</p>
</h4>

<p align="center">
  <a href="#rocket-technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#information_source-how-to-use">How To Use</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#thumbsup-how-to-contribute">How To Contribute</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-license">License</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#handshake-ds-course-ecosystem">DS Course Ecosystem</a>
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

# Deploy the loadbalancer, pods, replica set and containers in your cluster
$ kubectl apply -f devops/quarkus-k8s-aws-prd.yaml

# See all your resources deployed
$ kubectl get all -n quarkus-k8s

# Make a port forward to one of your pods to be able to access then
# Create a config-server repo to save your project's configurations like this [repo](https://github.com/Duduxs/ead-config-server-repo-ms) 
# Go on ms-config-server repo and put on your github username and your token (it doesn't need to define it if you create the repo above as public)
# Now to docker.compose.yaml and replace those variables too.
```

To run in dev mode:

```bash
# Up ms-worker and ms-user databases (see the final lines in docker-compose.yaml)
# Exec the monorepo in the following order by the their main class -> eureka-server, config-server, api-gateway, ms-oauth, ms-user, ms-worker, ms-payroll
```
To run in prod mode:

```bash
# Execute dockerRun.sh
```

## :thumbsup: How To Contribute

-  Make a fork;
-  Create a branch with your feature: `git checkout -b my-feature`;
-  Commit changes: `git commit -m 'feat: My new feature'`;
-  Make a push to your branch: `git push origin my-feature`.

## :memo: License
This project is under the MIT license. See the [LICENSE](https://github.com/Duduxs/ds-course-monorepo-ms/blob/main/LICENSE) for more information.

## :handshake: DS Course Ecosystem
Take a look into others microservices that were developed for the Course Plataform.
 
 - Cross Cuting Microservices
    - <a href="https://github.com/Duduxs/ds-course-monorepo-ms/tree/main/ms-eureka-server">Eureka Server</a>
    - <a href="https://github.com/Duduxs/ds-course-monorepo-ms/tree/main/ms-config-server">Config Server</a>
    - <a href="https://preview.redd.it/cu5a8cpv1tc41.jpg?auto=webp&s=b0b94bec85bd22baa406152c9f0954cb523b387c">Config Server Impl (Private 💀)</a>
    - <a href="https://github.com/Duduxs/ds-course-monorepo-ms/tree/main/api-gateway">Gateway</a>
     - <a href="https://github.com/Duduxs/ds-course-monorepo-ms/tree/main/ms-oauth">Oauth</a>
- Business Microservices
    - <a href="https://github.com/Duduxs/ds-course-monorepo-ms/tree/main/ms-user">User</a>
    - <a href="https://github.com/Duduxs/ds-course-monorepo-ms/tree/main/ms-payroll">Payroll</a>
    - <a href="https://github.com/Duduxs/ds-course-monorepo-ms/tree/main/ms-worker">Worker</a>
    
---

<h4 align="center">
    Made by Eduardo José 😆 <a href="https://www.linkedin.com/in/eduarddojose/" target="_blank">Contact me!</a>
</h4>
