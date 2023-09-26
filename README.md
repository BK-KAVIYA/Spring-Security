# Spring Boot Security Configuration

This README provides an overview of the Spring Boot security configuration found in the `SecurityConfig` class. This configuration is used to set up basic authentication and role-based authorization for your Spring Boot application.

## Table of Contents

- [Introduction](#introduction)
- [Configuration Details](#configuration-details)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Spring Boot Security is a powerful framework that allows you to secure your applications easily. In this project, we have implemented basic security features using Spring Security. This configuration provides a simple example of how to set up user authentication and authorization for different roles.

## Configuration Details

The `SecurityConfig` class is the heart of the security configuration. Here's a breakdown of its key components:

- **UserDetailsService**: In this configuration, we create two users, "user" and "admin," with their respective roles. These users are stored in-memory using `InMemoryUserDetailsManager`.

- **SecurityFilterChain**: This method configures the security filter chain. It defines rules for different endpoints:
  - `/` is accessible to all (permit all).
  - `/user` is restricted to users with the "USER" role.
  - `/admin` is restricted to users with the "ADMIN" role.
  
  We also disable CSRF protection in this configuration.

## Usage

To use this security configuration in your Spring Boot application, follow these steps:

1. Copy the `SecurityConfig` class into your project.

2. Customize the security rules and user details according to your application's requirements.

3. Ensure that you have the necessary Spring Security dependencies in your `pom.xml` or `build.gradle` file.

4. Your Spring Boot application should automatically pick up this security configuration.

5. Access your application's endpoints as per the defined rules in the configuration.

## Contributing

Contributions to this project are welcome. If you have suggestions for improvements or encounter issues, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](dilshankavinda371@gmail.com). You are free to use, modify, and distribute it as per the terms of the license.
