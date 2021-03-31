#language:pt
Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD
 
	Cenario: Aceitar o cookie LGPD
		Dado que eu estou no site da accenture
		Entao aceito os termos LGPD
	 
	Cenario: Configuracoes do cookie
		Dado que eu estou no site da accenture
		E clico em configuracaes de cookie
		Entao devo ver o item "Sua privacidade"
    E devo ver "Cookies estritamente necessarias"
    E devo ver "Cookies Analiticos de Primeira Parte"
    E devo ver "Cookies de Desempenho e Cookies Funcionais"
    E devo ver "Cookies de Publicidade e Redes Sociais"