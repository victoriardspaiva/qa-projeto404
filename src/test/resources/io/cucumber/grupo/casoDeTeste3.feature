#language: pt
Funcionalidade: Acessar lista de carreiras da Accenture

	Cenario: Acessar o item de vagas de tecnologia
		Dado que eu estou no site da accenture
		E aceito os termos LGPD para teste
		E clico no menu carreiras
		E clico no item procurar por vagas
		E digito no campo de busca Desenvolvedor
		E clico no botao procurar
		Entao devo encontrar vagas para programadores