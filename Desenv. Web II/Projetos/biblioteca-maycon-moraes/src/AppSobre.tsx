import SobreMim from './componentes/Sobremim.tsx'
import QuemSouEu from './componentes/Quemsoueu.tsx'
import Formacao from './componentes/Formacao.tsx'
import Habilidades from './componentes/Habilidades.tsx'
import Projetos from './componentes/Projetos.tsx'
import Imagem from './componentes/Imagem.tsx'
import Contato from './componentes/Contato.tsx'

export default function AppSobre () {
    return (
        <div>
            <SobreMim />
            <QuemSouEu />
            <Formacao /> 
            <Habilidades />
            <Projetos />
            <Imagem />
            <Contato />
        </div>

    )
}