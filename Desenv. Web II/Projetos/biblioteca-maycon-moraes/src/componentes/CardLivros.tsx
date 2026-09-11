interface CardLivrosProps {
    titulo: string
    autor: string
    categoria: string
}


function CardLivros({titulo,  autor,  categoria,}: CardLivrosProps) {
    return (
        <article>
            <section className="flex gap-6 border-b border-gray-300 py-6">
                <div className="h-32 w-24 shrink-0 border-2 border-black">   
                </div>
                <div>
                <h3 className="text-x1 font-bold text-gray-900"> {titulo} </h3>
                    <p className="mt-2 text-gray-600"> {autor} </p>
                    <p className="mt-2 text-sm text-gray-500"> {categoria} </p>
                </div>
            </section>
        </article>

    )
}

export default CardLivros