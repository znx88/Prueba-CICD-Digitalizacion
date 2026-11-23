# Prueba práctica de CI/CD — Equipo 9
Proyecto Java 17 con Maven y tres pruebas unitarias JUnit 5. GitHub Actions compila, ejecuta pruebas y guarda el JAR generado.

## Cómo ejecutarlo
1. Crea un repositorio **público o privado** vacío en GitHub.
2. Sube **el contenido de esta carpeta**, manteniendo `.github/workflows/ci.yml` (no subas solo el ZIP).
3. Abre **Actions** en GitHub y entra en **Prueba CI Java Maven**. Si hace falta, selecciona **Run workflow**.
4. Abre la ejecución y el trabajo **compilar-y-probar**; revisa que las pruebas hayan terminado correctamente.
5. Descarga o visualiza el artefacto **prueba-cicd-jar** si aparece tras finalizar la ejecución.

## Capturas reales para el informe
- Captura 1: estructura del repositorio donde se vea `.github/workflows/ci.yml` y `pom.xml`.
- Captura 2: pestaña Actions con la ejecución y su fecha/resultado.
- Captura 3: detalle de `Compilar y ejecutar pruebas` con `Tests run: 3, Failures: 0, Errors: 0` **solo si ese es el resultado real**.

## Texto para el informe (ajustar al resultado real)
Se preparó un proyecto Java 17 con Maven y tres pruebas JUnit 5. Se configuró un workflow de GitHub Actions para activarse al subir cambios y ante pull requests, compilar el código, ejecutar las pruebas y generar un JAR. La ejecución se documenta con las capturas adjuntas. Resultado observado: [completar tras ejecutar]. Fecha: [completar]. Enlace al repositorio: [completar].
