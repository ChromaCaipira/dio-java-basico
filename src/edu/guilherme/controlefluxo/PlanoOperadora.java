package edu.guilherme.controlefluxo;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        if (plano == "B") {
            System.out.println("Plano: BASIC");
        } else if (plano == "M") {
            System.out.println("Plano: MIDIA");
        } else if (plano == "T") {
            System.out.println("Plano: TURBO");
        } else {
            System.out.println("PLANO INVÁLIDO");
        }

        System.out.println("[BENEFÍCIOS]:");
        // SWITCH CASE, SEM O USO DO BREAK EM TODOS OS CASOS
        switch (plano) {
            case "T":{ // PLANO TURBO POSSUI TODOS OS BENEFICIOS ABAIXO
                System.out.println("5Gb de Youtube");
            }
            case "M":{ // PLANO MIDIA POSSUI SEU BENEFÍCIO + DO PLANO BASIC
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B":{ // PLANO BASIC POSSUI APENAS SEU BENEFÍCIO
                System.out.println("100 minutos de ligação");
                break;
            }
            default:{ // EM CASO DE PLANO INVÁLIDO, NÃO HÁ BENEFÍCIOS VÁLIDOS
                System.out.println("---");
                break;
            }
        }
    }
}
