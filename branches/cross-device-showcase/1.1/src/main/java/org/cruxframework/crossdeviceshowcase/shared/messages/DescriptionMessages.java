package org.cruxframework.crossdeviceshowcase.shared.messages;

import org.cruxframework.crux.core.client.i18n.MessageName;

import com.google.gwt.i18n.client.Messages;

@MessageName("description_messages")
public interface DescriptionMessages extends Messages
{	
	@DefaultMessage("<p>O componente DeviceAdaptiveGrid permite exibir as colunas de acordo com o tipo de dispositivo "
			+ "que o está visualizando. Para dispositivos com display grande (PC, tablet etc.), o grid exibirá "
			+ "as colunas definidas na tag <code>largeColumns</code>, já para dispositivos pequenos, ele exibirá as "
			+ "colunas definidas na tag <code>smallColumns</code>.</p>")
	String adaptivegridDescription();
	
	@DefaultMessage("<p>O componente Anchor é uma âncora cross-device. Com este componente é possível criar links "
			+ "para navegação em uma mesma página (Ir para o fim da página, Ir para o início da página) e também links "
			+ "para abrir páginas externas (Link Crux Framework do exemplo). É possível ainda disparar eventos a partir "
			+ "do clique no componente, como o pop-up informativo que aparece ao clicar no primeiro exemplo.</p>")
	String anchorDescription();
	
	@DefaultMessage("<p>O ColorPicker é um componente que permite que o usuário selecione uma cor do espectro de "
			+"cores e aplique-a em um determinado elemento. A funcionalidade é semelhante selecionadores " 
			+"de cores encontrados em softwares desktop.</p>")
	String colorPickerDialogDescription();
	
	@DefaultMessage("<p>Buttons são elementos que disparam ações quando clicados, este componente foi feito pensando também em " 
			+"dispositivos de toque, tratando os eventos de forma diferenciada em um smartphone ou tablet, por exemplo.</p>")
	String buttonDescription();
	
	@DefaultMessage("<p>O componente DateBox permite selecionar datas que serão atribuídas para um "
			+ "textBox. Este componente utiliza o componente DatePicker.</p>")
	String dateBoxDescription();

	@DefaultMessage("<p>DialogBoxes são janelas flutuantes, que se sobrepõem à janela principal para realizar"
			+ "algum tipo de comunicação adicional com usuário. São bastante úteis para exibir porções de dados"
			+ "que ocupariam muito espaço na tela ou para tratar fluxos secundários nos casos de uso da aplicação.</p>"
			+ "<p>É possível adicionar apenas um componente ao DialogBox, porém este pode ser qualquer componente válido, "
			+ "desde um simples botão até um painel.</p>")
	String dialogBoxDescription();

	@DefaultMessage("<p>DialogViewContainer é um container de views que utiliza uma caixa de diálogo "
			+ "flutuante para apresentá-las, possibilitando utilizar os benefícios de uma janela "
			+ "flutuante para views completas. </p> <p>No exemplo apresentado o container carrega uma view "
			+ "simulando uma tela de cadastro.</p>")
	String dialogViewContainerDescription();
	
	@DefaultMessage("<p>O FileUploader é um componente capaz de transmitir arquivos existentes no "
			+"dispositivo cliente para o servidor de aplicação. Construído sobre a especificação "
			+"XMLHttpRequest 2, é capaz de enviar múltiplos arquivos simultaneamente e prover "
			+"feedback de progresso ao usuário. Além disso, caso um arquivo enviado seja uma imagem, "
			+"exibe uma miniatura desse arquivo, enriquecendo a usabilidade do sistema.</p>")
	String fileUploaderDescription();

	@DefaultMessage("<p>O componente Filter é uma caixa de texto que sugere possíveis resultados a partir "
			+ "do conteúdo inserido pelo usuário. É um facilitador para o usuário no momento em que necessita "
			+ "inserir alguma informação ou fazer uma busca.</p><p>O Filter ainda permite Habilitar "
			+ "recursos como: animação, selecionar automaticamente e ativar um foco na sequência localizada.</p>"
			+ "<p>No exemplo acima, quando o usuário começar a digitar, a caixa de texto apresentará possíveis sugestões "
			+ "de meios de transporte de acordo com o dado inserido.</p>")
	String filterDescription();
	
	@DefaultMessage("<p>O propósito do FormDisplay é organizar os elementos de um formulário, "
			+"tornando mais simples a construção de telas cujo conteúdo seja essencialmente "
			+"de entrada de dados. Ele organiza os componentes de forma automática, provendo "
			+"diferentes posicionamentos de acordo com as características do dispositivo "
			+"cliente.</p>"
			+"<p>Em dispositivos de tela pequena, tais como smart phones, os componentes "
			+"são ordenados de forma vertical, evitando a rolagem horizontal da tela."
			+"Em dispositivos maiores, labels e componentes são alinhados lado a lado, aproveitando melhor "
			+"a largura da janela do navegador.</p>")
	String formDisplayDescription();
	
	@DefaultMessage("<p>Textboxes são campos de texto simples fornecidos pelo GWT. Podem ser estilizados dependendo do seu estado, " 
			+"e mostram de forma visal seu estado atual para o usuário.</p>")
	String textBoxDescription();
	
	@DefaultMessage("<p>O componente Image exibe imagens em formatos padrão da web (png, gif, jpg) com ajuste de tamanho (altura e largura).</p>"
			+ "<p>No exemplo apresentado, ao clicar em uma imagem, seu tamanho é modificado e suas informações são apresentadas logo abaixo.</p>")
	String imageDescription();
	
	@DefaultMessage("<p>O ListShuttle é um componente que possibilita a transferência de ítens de uma lista para outra. " 
			+ "É possível transferir um, vários ou todos os elementos de uma só vez.</p>"
			+ "<p>No exemplo apresentado os ítens das listas foram adicionados através de uma controller, " 
			+ "possibilitando buscar estas informações de uma fonte de dados.</p>")
	String listShuttleDescription();
	
	@DefaultMessage("<p>MaskedLabel é um componente de exibição de informações que tem a capacidade de ser "
			+"associado a um Formatter para exibir dados tipados em formato textual amigável. </p>" 
			+"<p> Neste exemplo associamos o MaskedLabel a um formatador de data, para exibirmos "
			+"a data de nascimento do personagem.</p>")
	String maskedLabelDescription();
	
	@DefaultMessage("<p>MaskedTextBox é um componente de entrada de informações que tem a capacidade de ser associado "
			+"a um Formatter para guiar o usuário durante o preenchimento e garantir a conversão dessas informações " 
			+"em dados tipados a serem consumidos pela aplicação.</p>"
			+"<p>Neste exemplo associamos o MaskedTextBox para ler uma data digitada pelo usuário.</p>")
	String maskedTextBoxDescription();
	
	@DefaultMessage("<p>MessageBox é uma janela flutuante usada para exibir informações textuais ao usuário."
			+"De acordo com a categoria da mensagem exibida ( <code>INFO</code>, <code>SUCCESS</code>, "
			+"<code>WARN</code> ou <code>ERROR</code>), o MessageBox apresenta um estilo visual específico.</p>")
	String messageBoxDescription();

	@DefaultMessage("<p>NumberTextBox é uma caixa de texto que permite apenas a inserção de números inteiros positivos.</p>"
			+ "<p>Este componente permite a definição de um valor máximo de caracteres que podem ser inseridos e também pode "
			+ "disparar um evento a partir da mudança dos valores da caixa de texto.")
	String numberTextBoxDescription();
	
	@DefaultMessage("<p>ProgressBox é um componente flutuante, usado para para indicar ao usuário que algum " 
			+"processamento interno está ocorrendo e evitar que ele realize outras ações antes que o "
			+"processamento termine. Pode ser exibido e ocultado programaticamente. É bastante útil nas "
			+"chamadas a serviços remotos, devido à natureza assíncrona dessa comunicação.</p>")
	String progressBoxDescription();
	
	@DefaultMessage("<p>PromoBanner é um componente para promover algo: um produto, uma ideia, um assunto, entre outros.</p>" 	
			+"<p>Pode ser adaptado para o uso em dispositivos de tela grande como desktops e pequenos como celulares."
			+"Possui vários recursos como: transição automática de uma imagem para outra com determinação de intervalo, "
			+"programação do tempo de transição, botão para controle e entre outros.</p>")
	String promoBannerDescription();
	
	@DefaultMessage("<p>O ScrollBanner é um componente para mostrar várias mensagens de texto, uma de cada vez, "
			+"apresentadas de forma periódica e sequencial."
			+"As mensagens podem ser adicionadas de forma declarativa ou programática e o tempo de transição "
			+"entre elas é definido no próprio componente.</p>"
			+"<p>No exemplo acima as 2 primeiras mensagens foram adicionadas de forma declarativa e as últimas "
			+"de forma programática através da controller.</p>")
	String scrollBannerDescription();
	
	@DefaultMessage("<p>O componente SingleSelect é uma caixa de listagem de seleção única e simples. "
			+ "Os ítens podem ser adicionados de forma declarativa e programática e também pode-se definir "
			+"se algum ítem já iniciará selecionado ou não.</p>" 	
			+"<p>No exemplo apresentado, os ítens da caixa à direita somente serão carregados a partir da seleção de um ítem na caixa à esquerda.</p>")
	String singleSelectDescription();
	
	@DefaultMessage("<p>O Slideshow é um componente usado para apresentação de imagens, de forma otimizada para "
			+"cada tipo de dispositivo. Suporta descrições, miniaturas, pré-carga das próximas imagens, "
			+"cache local de imagens visualizadas, redimensionamento automático de imagens, agrupamento "
			+"em álbuns, etc.</p>"
			+"<p>Possui um modelo flexível que permite ao desenvolvedor adaptar praticamente qualquer "
			+"modelo de layout desejado, além de realizar integração com APIs externas de serviços de " 
			+"imagens, como o Picasa.</p>")
	String slideShowDescription();
	
	@DefaultMessage("<p>O StackMenu é um menu hierárquico e vertical. Cada ítem em um StackMenu pode "
			+"ter um ou vários sub-ítens, inseridos de forma declarativa ou programática. "
			+"Também é possível disparar eventos de seleção neste componente, no exemplo apresentado "
			+ "são exibidas informações do ítem selecionado.</p>")
	String stackMenuDescription();
	
	@DefaultMessage("<p>O StyledPanel é um painel simples, cuja utilidade é agrupar " 
			+"visualmente componentes que possuem algum tipo de relação entre si. Em geral, é usado para "
			+"delimitar fomrulários, menus e criar barras de ferramentas. Sua estrutura interna é leve, sendo "
			+"constituído por duas DIVs aninhadas, o que permite uma grande flexibilidade de estilização "
			+"através dos recursos CSS3.</p>"
			+"<p>Suporta apenas um componente em seu interior, pois não provê nenhum recurso para alinhamento "
			+"dos componentes internos. Dessa forma, para abrigar diversos componentes dentro de um StyledPanel, "
			+"é necessário agrupá-los logicamente em outro componente que possua essa capacidade, como, por exemplo, "
			+"o FormDisplay.</p>")
	String styledPanelDescription();
	
	@DefaultMessage("<p>O StoryBoard é um painel de distribuição de elementos que se adapta "
			+"ao tipo de dispositivo.</p>"
			+"<p>Em dispositivos de tela grande como desktops, os elementos são "
			+"distribuídos lado a lado até o final da largura determinada, gerando uma "
			+"quebra de linha automática e continuando o preenchimento com os elementos "
			+"até o final."
			+"Em dispositivos de tela pequena como celulares o processo é o mesmo, "
			+"porém os elementos são dispostos um abaixo do outro se adequando a "
			+"visibilidade do celular.</p>"
			+"<p>Os itens do Storyboard podem ser inseridos de forma declarativa ou "
			+"programática, possibilitando o uso de uma lista de dados como neste exemplo.</p>")
	String storyBoardDescription();
	
	@DefaultMessage("<p>TextArea é um campo de texto multi-linha, que poder ser definido por número de linhas e número máximo de caracteres (maxLength). </p>" 
			+"<p>Neste exemplo o número máximo de caracteres se inicia em 150, insira um novo número, clique em aplicar e faça o teste.</p>")
	String textAreaDescription();
	
	@DefaultMessage("<p>O componente Timer é um contador de tempo capaz de disparar eventos programados. Este componente "
			+ "Também permite ativar contagem regressiva ou definir um determinado valor para início da contagem.</p>"
			+ "<p>No exemplo apresentado o Timer realiza as funções de um cronômetro e dispara uma mensagem quando "
			+ "alcança a contagem de 5 segundos.</p>")
	String timerDescription();
	
	@DefaultMessage("<p>Menu interativo cross-device, se adpta a dispositivos de tela grande como desktops e telas pequenas como celulares. "
			+"Possui definição da página inicial do menu e também possibilita que as páginas possam ser inseridas no menu de forma declarativa e programática.</p>" 
			+"<p>Neste exemplo a página <b>Buscar Lojas</b> foi adicionada programaticamente através de uma controller.</p>")
	String topMenuDisposalDescription();
	
	@DefaultMessage("<p>RandomPager é um paginador que tem conhecimento do número total de páginas. Desta forma, o usuário final pode ter um maior controle sobre o material paginado.</p>"
			+ "<p>No exemplo implementado, o componente faz a páginação dos resultados de um componente de Grid (DeviceAdaptiveGrid).</p>")
	String randomPagerDescription();
}