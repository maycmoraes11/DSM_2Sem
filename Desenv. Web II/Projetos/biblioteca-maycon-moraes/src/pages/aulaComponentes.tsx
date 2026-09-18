import Header from '../componentes/Header'
import CardLivros from '../componentes/CardLivros'

function App(){
  return (
    <div className="min-h-screen bg-gray-100"> 
    <Header />
    <CardLivros titulo="1984" autor='George Orwell' categoria='Ficcão Cientifica' />
    <CardLivros titulo="A Revolução dos Bichos" autor='George Orwell' categoria='Ficcão Cientifica' />
    <CardLivros titulo="Volta ao Mundo em 80 dias" autor='Julio Verne' categoria='Ficcão Cientifica' />
    <CardLivros titulo="O planalto e a Estepe" autor='Pepetela' categoria='Romance' />
    </div>
  )
}

export default App