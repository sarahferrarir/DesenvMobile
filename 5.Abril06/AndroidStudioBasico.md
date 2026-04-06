## Android Studio: Cheat Sheet Essencial

### 1. Atalhos de Teclado 
* **Busca em tudo:** `Shift` + `Shift`
  > Use quando esquecer onde está um arquivo ou uma configuração. Digite "MainActivity" ou "Logcat" para ir direto.
* **Sugestões/Correções rápidas:** `Alt` + `Enter`
  > O "salvador". Se o código estiver vermelho (erro), pare o cursor em cima e use este atalho. Ele sugere importar bibliotecas ou criar métodos que faltam.
* **Formatar código:** `Ctrl` + `Alt` + `L`
  > Use sempre antes de salvar. Ele organiza a indentação do XML e do Kotlin automaticamente.
* **Compilar e Rodar:** `Shift` + `F10`
* **Localizar no arquivo:** `Ctrl` + `F`
* **Comentar linha/bloco:** `Ctrl` + `/`

---

### 2. Estrutura do Projeto
* **`app/src/main/java`**: Onde fica o código fonte Kotlin ou Java.
    - Arquivo `MainActivity.kt`.
* **`app/src/main/res/layout`**: Arquivos XML que definem a interface (UI).
    - Arquivo `activity_main.xml`.
* **`app/src/main/res/drawable`**: Imagens e ícones.
* **`app/src/main/res/values`**: Strings, cores e estilos (bom para evitar hardcoded text).
  > `res/values/strings.xml`: **Exemplo prático:** Em vez de escrever "Bem-vindo" direto no Layout, você cria `<string name="welcome_msg">Bem-vindo</string>`. Isso facilita se precisar traduzir o app depois.  
* **`AndroidManifest.xml`**: Configurações globais (permissões, ícone do app, atividades).
  > `AndroidManifest.xml`: É aqui que você pede permissão para usar a Internet ou a Câmera: `<uses-permission android:name="android.permission.INTERNET" />`.



---

### 3. O Ciclo de Vida da Activity
Fundamental para entender como o app se comporta ao abrir, fechar ou girar a tela:
1.  **`onCreate()`**: Inicializa a interface e variáveis.
     - Significa alocar memória / criar variável;
     - Onde você vincula o código ao layout: `setContentView(R.layout.activity_main)`.
2.  **`onStart()` / `onResume()`**: App visível e pronto para interação.
     - `onStart()` faz o app ficar visível mas não tem interação, a partir do momento que vc interage com o app fica `onResume()`.
3.  **`onPause()` / `onStop()`**: App indo para o segundo plano.
     - Enquanto o `onPause()` é um estado "parcial" (ex: uma caixa de diálogo transparente apareceu na frente), o `onStop()` é quando o app sumiu totalmente da tela (você apertou o Home ou trocou de app).
4.  **`onDestroy()`**: App sendo encerrado da memória.
     - **Giro de tela:** Quando você gira o celular, a Activity é destruída (`onDestroy`) e recriada (`onCreate`). Se não salvar os dados, eles somem!
5.  **`setContentView`:** A linha `setContentView(R.layout.activity_main)` é o momento exato em que o Android Studio "cola" o seu código Kotlin no seu design XML.

---

### 4. Componentes de Interface Comuns
* **`TextView`**: Exibe texto.
* **`Button`**: Botão clicável.
* **`EditText`**: Campo para entrada de texto do usuário.
* **`ImageView`**: Exibe imagens.
* **`ConstraintLayout`**: O container padrão para posicionar elementos de forma flexível.

Por exemplo, um formulário simples de login usaria estes componentes dentro de um `ConstraintLayout`:

```XML
<EditText
    android:id="@+id/editNome"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="Digite seu nome" />

<Button
    android:id="@+id/btnEnviar"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Entrar" />
```


---

### 5. Build System: Gradle
O Gradle gerencia as dependências e a compilação do seu app.
* **`build.gradle (Project)`**: Configurações globais do projeto.
* **`build.gradle (Module: app)`**: Onde você adiciona bibliotecas externas (ex: Retrofit, Room) na seção `dependencies`.
  - **Exemplo:** Para carregar imagens da internet facilmente, você adicionaria a biblioteca Glide:
    ```Gradle
    dependencies {
        implementation("com.github.bumptech.glide:glide:4.12.0")
    }
    ```
    *Após mudar algo aqui, você sempre deve clicar em "Sync Now" no topo da tela.*
    
---

### 6. Debug e Logcat
* **Logcat:** Janela inferior para monitorar mensagens do sistema e erros em tempo real.
    - Filtro: No Logcat, digite `tag:TESTE_BOTAO` para ver apenas as suas mensagens, ignorando os milhares de avisos do sistema Android.
* **Tags de Log:** Use `Log.d("TAG", "Mensagem")` para debugar seu código sem usar print.
* **Debugger:** Clique na lateral da linha de código para criar um *breakpoint* e use o ícone do "inseto" para rodar passo a passo.
    - Exemplo: travar o app em uma linha específica e ver qual o valor real de uma variável naquele exato momento.

---

### 7. Lógica de Interação (Kotlin)

- **Pegar referência:** `val componente = findViewById<Tipo>(R.id.id_no_xml)`
- **Clique de botão:** `botao.setOnClickListener { // ação aqui }`
- **Ler/Escrever texto:** > * Ler: `val texto = campo.text.toString()`
    - Escrever: `campo.text = "Novo Texto"`

---

### 8. Erros Comuns
* **R vermelho:** Vá em *Build > Clean Project*. Resolve metade dos problemas fantasmas do Android Studio.
