<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>recherche</title>
<link rel="stylesheet" href="style/page2.css">
</head>
<body>
	<div class="title-container">
		<h1 class="title"></h1>
		<h1 class="title-down"></h1>
	</div>
	<div>

		<form action="findlivrebyaut" method="post">

			<fieldset class="field-container">
				<input type="text" placeholder="chercher par auteur." name="nameaut"
					class="st-default-search-input field" />
				<div class="icons-container">
					<div class="icon-search"></div>
				</div>

			</fieldset>
			<br /> <br />

		</form>
		<form action="findlivrebycateg" method="post">
			<table>
				<tr>
					<label for="pays">choisissez une categorie</label>
					<br />
					<select name="categ" id="mon_select">
						<option value="informatique">informatique</option>
						<option value="informatique">mathematique</option>
						<option value="roman">roman</option>
						<option value="biologie">biologie</option>
						<option value="autre">autre</option>
					</select>
				</tr>
				<tr>
					<input type="submit" value="valider " />
				</tr>


			</table>

		</form>

	</div>
	<form action="ajouterLivre" method="post">
		<table>
			<tr>
				<th></th>
				<th><label for="pays">choisissez une categorie</label><br /> <select
					name="categ2" id="catego">
						<option value="informatique">informatique</option>
						<option value="informatique">mathematique</option>
						<option value="roman">roman</option>
						<option value="biologie">biologie</option>
						<option value="autre">autre</option>
				</select></th>
			<tr>
			<tr>
				<th>nom complet de l auteur :</th>
				<th><input type="text" name="auteur" /><br /></th>
			</tr>
			<tr>
			<tr>
				<th>nom de livre:</th>
				<th><input type="text" name="livre" /><br /></th>
			</tr>
			<tr>
				<th>nombre de pages:</th>
				<th><input type="number" name="nbpage" /><br /></th>
			</tr>
			<tr>
				<th></th>
				<th><input type="submit" value="ajouter livre" /></th>
			</tr>

		</table>
	</form>

</body>
</html>