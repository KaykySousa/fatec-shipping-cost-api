{
    "customer_id": "12345",
    "customer_name": "João Silva",
    "customer_address": {
        "street": "Rua Exemplo",
        "number": "123",
        "city": "São Paulo",
        "state": "SP",
        "zip_code": "01234-567"
    },
}

{
    "order": {
        "customer_id": "12345",
        "customer_name": "João Silva",
        "customer_address": {
            "street": "Rua Exemplo",
            "number": "123",
            "city": "São Paulo",
            "state": "SP",
            "zip_code": "01234-567"
        },
    },
    "value": 50.00,
    "can_ship": true,
}

- [X] Enviar dados do cliente
- [X] Calcular valor do frete e se pode realizar o frete
- [X] Cache (Redis)
- [X] Mongo
- [ ] Validação dos dados
