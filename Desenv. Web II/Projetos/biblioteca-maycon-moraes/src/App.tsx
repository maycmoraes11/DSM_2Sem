import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import Aulas from './pages/Aulas';
import Desenvolvedor from './pages/Desenvolvedor';
import Estudos from './pages/Estudos'; // Importe o componente

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Aulas" element={<Aulas />} />
        <Route path="/Desenvolvedor" element={<Desenvolvedor />} />
        <Route path="/Estudos" element={<Estudos />} /> {/* Nova Rota */}
      </Routes>
    </BrowserRouter>
  );
}

export default App;