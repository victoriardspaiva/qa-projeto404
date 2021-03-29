#language:pt
Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
 
	Cenario: Aceitar o cookie LGPD
		Dado que eu estou no site da accenture
		Entao aceito os termos LGPD
	 
	Cenario: Configuracoes do cookie
		Dado que eu estou no site da accenture
		E clico em configuracaes de cookie
		Entao devo ver os itens
			|sua privacidade|
			|Cookies estritamente necessarias|
			|Cookies Analiticos de Primeira Parte|
			|Cookies de Desempenho e Cookies Funcionais|
			|Cookies de Publicidade e Redes Sociais|