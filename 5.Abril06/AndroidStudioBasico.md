## Android Studio: Cheat Sheet Essencial

### 1. Atalhos de Teclado 
* **Busca em tudo:** `Shift` + `Shift`
* **Sugestões/Correções rápidas:** `Alt` + `Enter`
* **Formatar código:** `Ctrl` + `Alt` + `L`
* **Compilar e Rodar:** `Shift` + `F10`
* **Localizar no arquivo:** `Ctrl` + `F`
* **Comentar linha/bloco:** `Ctrl` + `/`

---

### 2. Estrutura do Projeto
* **`app/src/main/java`**: Onde fica o código fonte Kotlin ou Java.
* **`app/src/main/res/layout`**: Arquivos XML que definem a interface (UI).
* **`app/src/main/res/drawable`**: Imagens e ícones.
* **`app/src/main/res/values`**: Strings, cores e estilos (bom para evitar hardcoded text).
* **`AndroidManifest.xml`**: Configurações globais (permissões, ícone do app, atividades).



---

### 3. O Ciclo de Vida da Activity
Fundamental para entender como o app se comporta ao abrir, fechar ou girar a tela:
1.  **`onCreate()`**: Inicializa a interface e variáveis.
2.  **`onStart()` / `onResume()`**: App visível e pronto para interação.
3.  **`onPause()` / `onStop()`**: App indo para o segundo plano.
4.  **`onDestroy()`**: App sendo encerrado da memória.

---

### 4. Componentes de Interface Comuns
* **`TextView`**: Exibe texto.
* **`Button`**: Botão clicável.
* **`EditText`**: Campo para entrada de texto do usuário.
* **`ImageView`**: Exibe imagens.
* **`ConstraintLayout`**: O container padrão para posicionar elementos de forma flexível.



---

### 5. Build System: Gradle
O Gradle gerencia as dependências e a compilação do seu app.
* **`build.gradle (Project)`**: Configurações globais do projeto.
* **`build.gradle (Module: app)`**: Onde você adiciona bibliotecas externas (ex: Retrofit, Room) na seção `dependencies`.

---

### 6. Debug e Logcat
* **Logcat:** Janela inferior para monitorar mensagens do sistema e erros em tempo real.
* **Tags de Log:** Use `Log.d("TAG", "Mensagem")` para debugar seu código sem usar print.
* **Debugger:** Clique na lateral da linha de código para criar um *breakpoint* e use o ícone do "inseto" para rodar passo a passo.
