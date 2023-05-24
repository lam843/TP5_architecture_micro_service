# TP5_architecture_micro_service
Activité pratique N° 5 : Mise en oeuvre d'une architecture micro-service

1. Créer le micro service Customer-service • Créer l’entité Customer • Créer l’interface CustomerRepository basée sur Spring Data • Déployer l’API Restful du micro-service en utilisant Spring Data Rest • Tester le Micro service
2. Créer le micro service Inventory-service • Créer l’entité Product • Créer l’interface ProductRepository basée sur Spring Data • Déployer l’API Restful du micro-service en utilisant Spring Data Rest • Tester le Micro service
3. Créer la Gateway service en utilisant Spring Cloud Gateway
1. Tester la Service proxy en utilisant une configuration Statique basée
sur le fichier application.yml
2. Tester la Service proxy en utilisant une configuration Statique basée
une configuration Java
4. Créer l’annuaire Registry Service basé sur NetFlix Eureka Server
5. Tester le proxy en utilisant une configuration dynamique de Gestion des
routes vers les micro services enregistrés dans l’annuaire Eureka Server
6. Créer Le service Billing-Service en utilisant Open Feign pour
communiquer avec les services Customer-service et Inventory-service
7. Créer un client Angular qui permet d’afficher une facture

===========================================================================


<details>
<summary> Créer le micro service Customer-service:</summary>
                               
#### 1 ---> Test customers:
 ![image](https://github.com/lam843/TP5_architecture_micro_service/assets/78732216/047c34eb-1a28-46b4-8a24-b25641d9da81)
 ![image](https://github.com/lam843/TP5_architecture_micro_service/assets/78732216/4d687d59-8f28-47dc-828c-18bde96f8a66)



</details>

<details>
<summary> Créer le micro service Inventory-service</summary>
                               
#### 1 ---> Test the Products:
  ![image](https://github.com/lam843/TP5_architecture_micro_service/assets/78732216/6d33421d-dfe0-4935-afc3-1abe4edf63cb)


</details>

<details>
<summary>Créer la Gateway service en utilisant Spring Cloud Gateway:</summary>
                               
#### 1 ---> For Products:
![image](https://github.com/lam843/TP5_architecture_micro_service/assets/78732216/6a6fcdbe-594b-4b79-a6a9-1c548f1e0213)
#### 2 ---> For Customers:
 ![image](https://github.com/lam843/TP5_architecture_micro_service/assets/78732216/a361f974-4aa8-4c11-87fd-700fdfdedbd2)


</details>
<details>
<summary> Créer l’annuaire Registry Service basé sur NetFlix Eureka Server:</summary>
                               
#### 1 ---> Test the Unary Model using BloomRPC:

</details>


<details>
<summary>  Tester le proxy en utilisant une configuration dynamique de Gestion des
routes vers les micro services enregistrés dans l’annuaire Eureka Server:</summary>
                               
#### 1 ---> Test the Unary Model using BloomRPC:

</details>
<details>
<summary> Créer Le service Billing-Service en utilisant Open Feign pour
communiquer avec les services Customer-service et Inventory-service:</summary>
                               
#### 1 ---> Test the Unary Model using BloomRPC:

</details>
<details>
<summary> Créer un client Angular qui permet d’afficher une facture </summary>
                               
#### 1 ---> Test the Unary Model using BloomRPC:

</details>
