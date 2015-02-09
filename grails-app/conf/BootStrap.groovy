import com.br.rafanteapps.components.Attribute
import com.br.rafanteapps.components.Ingredient
import com.br.rafanteapps.components.IngredientAttribute
import com.br.rafanteapps.components.KitchenWare
import com.br.rafanteapps.components.PrepareMode
import com.br.rafanteapps.components.Recipe

class BootStrap {

    def init = { servletContext ->
        def pao = new Ingredient(name: "Pão")
        pao.save(flush: true)
        def bife = new Ingredient(name: "Bife de Hambúrguer")
        bife.save(flush: true)
        def doce = new Attribute(name: "Doce")
        doce.save()
        def salgado = new Attribute(name: "Salgado")
        salgado.save()

        /*pao.attrs = []
        bife.attrs = []*/

        IngredientAttribute.create(pao, doce, 2)
        IngredientAttribute.create(pao, salgado, 2)
        IngredientAttribute.create(bife, doce, 2)
        IngredientAttribute.create(bife, salgado, 2)
        IngredientAttribute.create(bife, salgado, 2)
        /*(new IngredientAttribute(attribute: doce, value: 1)).save(flush: true, insert: true)
        (new IngredientAttribute(attribute: salgado, value: 1)).save(flush: true, insert: true)

        (new IngredientAttribute(attribute: doce, value: 1)).save(flush: true, insert: true)
        (new IngredientAttribute(attribute: salgado, value: 1)).save(flush: true, insert: true)*/

        pao.save()
        bife.save()

        //(new KitchenWare(name: "Chapa")).save(flush: true)
        (new Recipe(name: "Hamburguer", description: "Hambúrguer simples, apenas 2 pães e um bife de hambúrguer")).save()
        (new PrepareMode(description: "Método rápido")).save()
    }
    def destroy = {
    }
}
