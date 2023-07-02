//package com.warphotel.gateway.route;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RoutesConfiguration {
//
//    @Bean
//    public RouteLocator gatewayRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
//        return routeLocatorBuilder
//                .routes()
//                .route("registration_service_route", predicateSpec -> predicateSpec
//                        .path("/get")
//                        .filters(gatewayFilterSpec -> gatewayFilterSpec.addRequestHeader("SERVICE","REGISTRATION"))
//                        .uri("lb://registration-service/actuator/info")
//                )
//                .build();
//    }
//}
