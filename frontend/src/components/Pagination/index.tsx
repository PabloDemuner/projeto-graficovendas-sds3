import { SalePage } from "types/sale";

//Tipo responsavel pelas paginações
type Props = {
    page: SalePage;
    onPageFirstLast: Function;
}

const Pagination = ({ page, onPageFirstLast }: Props) => {

    return (
        <div className="row d-flex justify-content-center" >
            <nav>
                <ul className="pagination">
                    <li className={`page-item ${page.first ? 'disabled' : ''} `}>
                        <button className="page-link" onClick={() => onPageFirstLast(page.number - 1)}>Anterior</button>
                    </li>
                    <li className="page-item disabled">
                        <span className="page-link">{page.number + 1}</span>
                    </li>
                    <li className={`page-item ${page.last ? 'disabled' : ''} `}>
                        <button className="page-link" onClick={() => onPageFirstLast(page.number + 1)}>Próxima</button>
                    </li>
                </ul>
            </nav>
        </div >
    )
}

export default Pagination;