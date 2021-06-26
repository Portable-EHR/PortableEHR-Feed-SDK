# Portable EHR Java Feed SDK

If you want to integrate your project to Portable EHR, then you can use our Java SDK to jump start the integration. 
This project provides the model POJOs, request and response objects in a Jackson flavor. If you don't use Jackson/Spring in your project, we hope you can use this code as an inspiration.

To see how to use this SDK you can check the demo project [Portable EHR Java Feed Demo](https://github.com/Portable-EHR/PortableEHR-Java-Feed-Demo).

To integrate with Portable EHR FeedHub, your project must:
 - Implement the [Feed API](https://feed.portableehr.io:4004/docs). FeedHub will consume this API once is correctly configured.
 - Consume the [FeedHub API](https://feed.portableehr.io:3004/docs).

This SDK is divided in 2 main packages: *model* and *network*. 
Each package in its root contains common classes and subpackages *client* and *server* with specifics classes for each API.  

## com.portableehr.model
In this package you have the model entities

## com.portableehr.network
In this package you have mostly POJOs, and some deserializers where needed:
- com.portableehr.network: Containing common network entities
- com.portableehr.network.client.request.[endpoint]: All the entities needed to send the requests your Feed will send to FeedHub
- com.portableehr.network.client.response.[endpoint]: All the entities needed to map the FeedHub responses to java objects 
- com.portableehr.network.server.request.[endpoint]: All the entities needed to map the FeedHub requests to java objects
- com.portableehr.network.server.response.[endpoint]: All the entities needed to send the responses your Feed will send to FeedHub
