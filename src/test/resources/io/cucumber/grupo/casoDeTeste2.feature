#language:pt
@ignore
Funcionalidade: Acessar o site da accenture a mostrar a lista de servicos
    O objetivo e ver lista de servico no site da accenture

	Cenario: listar servicos da Accenture
		Dado que eu estou no site da accenture
		Entao clico no menu servicos devo ver os servicos disponiveis 
		
	Cenario: Clicar no servico cloud
		Dado que eu estou no site da accenture
		E clico no menu servicos
		E clico no clico no item do menu cloud
		Entao devo encontrar o titulo de "Servicos de Cloud"