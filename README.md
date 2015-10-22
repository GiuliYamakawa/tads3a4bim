# tads3a4bim
Criação do read.md


ExJMS

http://www.feltex.com.br/felix/exemplo-completo-jsf-primefaces-ejb-hibernate-mysql-jms/

http://www.feltex.com.br/felix/exemplo-completo-com-jsf-primefaces-ejb-hibernate-mysql-jms-topic/

ExCDI

https://netbeans.org/kb/docs/javaee/cdi-inject_pt_BR.html

ExJSF

https://computacaoanotada.wordpress.com/2011/07/15/aplicacao-ejb-3-1-jsf2-primefaces-3-0-maven-parte-1/

Passo 1: Primeiro criei um repositório no Github (new repository / marcar opção initialize.. / selecionar opção ..Java)
Passo 2:Fazer o fork no eclipse
Passo 3:Criei meus projetos e fiz o commit e o push no git; 
Passo 4:No wildfly criei JMS (QUEUE e TOPIC {alunoQueue/professorTopic}); 
Passo 5:Criei um pacote e copiei os códigos conforme os links do EAD;
Passo 6:Copiei do console do wildfly o caminho do JNDI para classe AlunoServletJMS na na annotation @Resource(java:jboss/exported/jms/queue/alunoQueue)
Passo 7:Startei wildfly e verifiquei no navegador os caminhos (http://localhost:8080/ExJMS/AlunoServletJMS) e () 

