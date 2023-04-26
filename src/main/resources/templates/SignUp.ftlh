<!DOCTYPE html>
<#import "spring.ftl" as spring/>
<head>
    <meta charset="UTF-8">
    <title><@spring.message 'signUp.page.title'/></title>
</head>
<body>
<div class="block1" >
    <h1 ><@spring.message 'signUp.page.header'/></h1>
    <h2><@spring.message 'signUp.page.description'/></h2>
    <form action="signUp" method="post">
        <@spring.bind path="signUpForm"/>
        <label for="firstName"><@spring.message 'signUp.form.label.enterFirstName'/></label>
        <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.firstName"/></#assign>
        <@spring.formInput "signUpForm.firstName" "placeholder=${i18Tooltip}"/>
        <br>
        <label for="lastName"><@spring.message 'signUp.form.label.enterLastName'/></label>
        <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.lastName"/></#assign>
        <@spring.formInput "signUpForm.lastName" "placeholder=${i18Tooltip}"/>
        <br>
        <label for="email"><@spring.message 'signUp.form.label.email'/></label>
        <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.email"/></#assign>
        <@spring.formInput "signUpForm.email" "placeholder=${i18Tooltip}"/>
        <br>
        <label for="password"><@spring.message 'signUp.form.label.password'/></label>
        <#assign i18Tooltip><@spring.message code="signUp.form.placeholder.password"/></#assign>
        <@spring.formInput "signUpForm.password" "placeholder=${i18Tooltip}"/>
        <input type="submit" value="Sign Up">
    </form>
</div>
</body>
</html>

<style>
    .block1 {
        height: 350px;
        width: 350px;
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        margin: auto;
    }
</style>